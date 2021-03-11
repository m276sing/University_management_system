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

public class software_development extends AppCompatActivity {

    Spinner search1,search2,search3;
    Button btn1,btn2,btn3;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_development);

        //spinner
        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select course","J2SE Java","Embedded Java","C# C Sharp","Core Java","C Programming Java","C++ Programming Language","VB Dotnet"};
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
                            if (s.equalsIgnoreCase("J2SE Java")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/java-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "J2SE Java", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Embedded Java")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/embedded-java-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Embedded Java", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("C# C Sharp")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/c-sharp-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "C# C Sharp", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Core Java")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/core-java-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Core Java", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("C Programming Language")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/c-programming-language-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "C Programming Language", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("C++ Programming Language")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/c-programming-language-training-mohali-2/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "C++ Programming Language", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("VB Dotnet")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/vb-dotnet-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "VB Dotnet", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(software_development.this)
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