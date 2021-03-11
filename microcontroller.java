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

public class microcontroller extends AppCompatActivity {


    Spinner search1;
    Button btn1;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microcontroller);


        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select course","Robotics","Arduino","ARM","AVR","8051","PIC","PCB Designing","Capstone Project","Matlab"};
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
                            if (s.equalsIgnoreCase("Robotics")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/robotics-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Robotics", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Arduino")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/arduino-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Arduino", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("ARM")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/arm-microcontroller-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "ARM", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("AVR")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/avr-microcontroller-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "AVR", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("8051")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/8051-microcontroller-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "8051", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("PIC")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/pic-microcontroller-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "PIC", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("PCB Designing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/pcb-designing-orcad-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "PCB Designing", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Capstone Project")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/capstone-project-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Capstone Project", Toast.LENGTH_LONG).show();
                            }else if (s.equalsIgnoreCase("Matlab")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/matlab-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Matlab", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(microcontroller.this)
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
