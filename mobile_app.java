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

public class mobile_app extends AppCompatActivity {

    Spinner search1,search2,search3;
    Button btn1,btn2,btn3;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_app);


        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select course","Android","Xamarin","IOS","Ionic","Phonegap","Cordova","Intel XDK","Modular Angular","Aurelia"};
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
                            if (s.equalsIgnoreCase("Android")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/android-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Android", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Xamarin")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/xamarin-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Xamarin", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("IOS")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/ios-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "IOS", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Ionic")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/ionic-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Ionic", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Phonegap")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/phonegap-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Phonegap", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Cordova")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cordova-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Cordova", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Mobile Angular")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/mobile-angular-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Mobile Angular", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Intel XDK")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/intel-xdk-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Intel XDK", Toast.LENGTH_LONG).show();
                            }else if (s.equalsIgnoreCase("Aurelia")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/aurelia-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Aurelia", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(mobile_app.this)
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
