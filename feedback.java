package com.multisoftsystem.multisoftsystem;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class feedback extends AppCompatActivity {


    EditText  et1,et2,et3,et4,et5;
    Button btn5;
    String  name,email,course,query1;
    //int contact;
    String contact;

    String line = null;
    String result = null;
    InputStream is = null;
    boolean w = false;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);

        btn5 = (Button) findViewById(R.id.button777);


        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                name = et1.getText().toString();
                email = et2.getText().toString();

                // contact = Integer.parseInt(et3.getText().toString());
                contact=et3.getText().toString();
                course= et4.getText().toString();
                query1 = et5.getText().toString();


                //int count=(int)Math.log10(contact)+1;


                if (name.length() > 0) {
                    et1.setFocusable(false);
                    et1.setError(null);

                    if (email.length() > 0) {
                        et2.setFocusable(false);
                        et2.setError(null);

                        //      if ( count > 0 && count==10) {


                        if(contact.length()==10)
                        {
                            et3.setFocusable(false);
                            et3.setError(null);



                            if (course.length() > 0) {
                                et4.setFocusable(false);
                                et4.setError(null);



                                if (query1.length() > 0) {
                                    et5.setFocusable(false);
                                    et5.setError(null);




                                    if (w = haveNetworkConnection()) {
                                        new Reg().execute("");
                                        Toast.makeText(getApplication(), "Your feedback is valuable to us", Toast.LENGTH_LONG).show();
                                        Intent i=new Intent(feedback.this,MainActivity.class);
                                        startActivity(i);
                                        finish();


                                    }
                                    else {
                                        new AlertDialog.Builder(feedback.this)
                                                .setTitle("No Internet")
                                                .setMessage("Please check your Internet Connection !!")
                                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                                    public void onClick(DialogInterface dialog, int which) {


                                                    }
                                                })
                                                .setIcon(android.R.drawable.ic_dialog_alert)
                                                .show();
                                    }

                                }
                                else
                                {
                                    et5.setFocusable(true);
                                    et5.setError("Required Feild");

                                }
                            }
                            else
                            {
                                et4.setFocusable(true);
                                et4.setError("Required Feild");

                            }
                        }
                        else
                        {
                            et3.setFocusable(true);
                            et3.setError("Required Feild");

                        }


                    }
                    else
                    {
                        et2.setFocusable(true);
                        et2.setError("Required Feild");

                    }

                }
                else
                {
                    et1.setFocusable(true);
                    et1.setError("Required Feild");

                }




            }
        });

    }

    class Reg extends AsyncTask<String, String, String>
    {
        @Override
        protected String doInBackground(String... params) {

            ArrayList<NameValuePair> values = new ArrayList<NameValuePair>();

            values.add(new BasicNameValuePair("name", name));
            values.add(new BasicNameValuePair("email", email));
            values.add(new BasicNameValuePair("contact",""+contact ));
            values.add(new BasicNameValuePair("course",course ));
            values.add(new BasicNameValuePair("query1", query1));
            try {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost("http://192.168.1.60/one1.php");
                httpPost.setEntity(new UrlEncodedFormEntity(values));
                HttpResponse Response = httpClient.execute(httpPost);
                HttpEntity entity = Response.getEntity();
                is = entity.getContent();
                Log.i("Tag", "Connection successful");
            } catch (Exception e) {

                Log.i("Tag", "not connected");
                Log.i("Tag", "result  retrived " + result);

            }

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
                is.close();
                result = sb.toString();
                Log.i("TAG", "result retrived " + result);
            } catch (Exception e) {
                Log.i("Tag", "result not retrived" + e.toString());

            }

            try {
                JSONObject obj = new JSONObject(result);
                if (obj.getString("status").equalsIgnoreCase("true")) {





                }



            } catch (Exception e) {
                Log.i("tag", e.toString());
            }

            return null;

        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }


    }

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI") || ni.getTypeName().equalsIgnoreCase("MOBILE")) {
                if (ni.isConnected())
                    haveConnectedWifi = true;
            }

        }
        return haveConnectedWifi;


    }
}




