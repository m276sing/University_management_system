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

public class testing extends AppCompatActivity {
    Spinner search1,search2,search3;
    Button btn1,btn2,btn3;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);


        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select course","Selenium Testing","Mannual Testing","QTP Quickest Professional Testing","Loadrunner testing","Six Sigma","JMeter","Mobile and Database Testing","Cucumber Testing","Automation Testing"};
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
                            if (s.equalsIgnoreCase("Selenium Testing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/selenium-testing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Selenium Testing", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Mannual Testing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/mannual-testing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Mannual Testing", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("QTP Quickest Professional Testing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/qtp-testing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "QTP Quickest Professional Testing", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Loadrunner testing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/loadrunner-testing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Loadrunner testing", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Six Sigma")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/six-sigma-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Six Sigma", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("JMeter")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/jmeter-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "JMeter", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Mobile and Database Testing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/mobile-database-testing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Mobile and Database Testing", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Cucumber Testing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cucumber-testing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Cucumber Testing", Toast.LENGTH_LONG).show();
                            }else if (s.equalsIgnoreCase("Automation Testing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/automation-testing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Automation Testing", Toast.LENGTH_LONG).show();
                            }
                            else {
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
                            new AlertDialog.Builder(testing.this)
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
