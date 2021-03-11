package com.multisoftsystem.multisoftsystem;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class bigdata extends AppCompatActivity {

    Spinner search1,search2,search3;
    Button btn1,btn2,btn3;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigdata);

        //Big data spinner
        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select Course","Big Data Analyst","Big Data Hadoop Architect"};
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,ar);
        aa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        search1.setAdapter(aa);
        search1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                final String s=parent.getItemAtPosition(position).toString();
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (w = haveNetworkConnection()) {
                            if (s.equalsIgnoreCase("Big Data Analyst")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/big-data-analyst-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Big Data Analyst", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Big Data Hadoop Architect")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/big-data-hadoop-architect-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Big Data Hadoop Architect", Toast.LENGTH_LONG).show();
                            } else {
                                fragment = new nothing();
                                Toast.makeText(getApplication(), "Please select correct option....", Toast.LENGTH_LONG).show();
                            }
                            if (fragment != null) {
                                android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                                ft.replace(R.id.web, fragment);
                                ft.commit();
                            }
                        }

                        else
                        {
                            new AlertDialog.Builder(bigdata.this)
                                    .setTitle("No Internet")
                                    .setMessage("Please connect to Internet to view course content!!")
                                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {

                                        }
                                    })
                                    .setIcon(android.R.drawable.ic_dialog_alert)
                                    .show();
                        }
                    }

                });
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        //Big Data SPINNER ENDS HERE

        //Hadoop spinner
        search2 = (Spinner) findViewById (R.id.search2);
        btn2=(Button)findViewById(R.id.btn2);
        String ar1[]={"Select course","Hadoop Developer","Hadoop Admin","Hadoop Data Analytics","Apache Spark and Scala","Comprehensive Hive","Comprehensive Pig","Comprehensive Scoop","Comprehensive Flume","Mastering Apache Ambari"};
        ArrayAdapter aaa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,ar1);
        aaa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        search2.setAdapter(aaa);
        search2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                final String s=parent.getItemAtPosition(position).toString();
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (w = haveNetworkConnection()) {
                            if (s.equalsIgnoreCase("Hadoop Developer")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/hadoop-developer-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Hadoop Developer", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Hadoop Admin")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/hadoop-admin-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Hadoop Admin", Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Hadoop Data Analytics"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/hadoop-data-analytics-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Hadoop Data Analytics",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Apache Spark and Scala"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/apache-spark-scala-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Apache Spark and Scala",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Comprehensive Hive"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/comprehensive-hive-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Comprehensive Hive",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Comprehensive Pig"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/comprehensive-pig-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Comprehensive Pig",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Comprehensive Scoop"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/comprehensive-scoop-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Comprehensive Scoop",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Comprehensive Flume"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/comprehensive-flume/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Comprehensive Flume",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Mastering Apache Ambari"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/mastering-apache-ambari-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Mastering Apache Ambari",Toast.LENGTH_LONG).show();
                            }
                            else
                            {
                                fragment=new nothing();
                                Toast.makeText(getApplication(),"Please select correct option....",Toast.LENGTH_LONG).show();
                            }

                            if(fragment!=null)
                            {
                                android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                                ft.replace(R.id.web,fragment);
                                ft.commit();
                            }
                        }

                        else
                        {
                            new AlertDialog.Builder(bigdata.this)
                                    .setTitle("No Internet")
                                    .setMessage("Please connect to Internet to view course content!!")
                                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {

                                        }
                                    })
                                    .setIcon(android.R.drawable.ic_dialog_alert)
                                    .show();
                        }
                    }

                });
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        //Hadoop SPINNER ENDS HERE


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
