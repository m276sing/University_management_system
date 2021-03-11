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

public class redhat extends AppCompatActivity {

    Spinner search1,search2,search3;
    Button btn1,btn2,btn3;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redhat);

        //REDHAT spinner
        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select course","RHCSA-Redhat Certified System Administrartor","RHCE-Redhat Certified Engineer","RHCA-Redhat Certified Architect Training","RHCVA-Redhat Certified Virtualization Administrator","JBCAA-JBOSS Certified Application Administrartor","Vmware","Cloud Computing"};
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
                            if (s.equalsIgnoreCase("RHCSA-Redhat Certified System Administrartor")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/rhcsa-redhat-certified-system-administrator-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "RHCSA-Redhat Certified System Administrartor", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("RHCE-Redhat Certified Engineer")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/rhce-redhat-certified-engineer-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "RHCE-Redhat Certified Engineer", Toast.LENGTH_LONG).show();
                            }else if (s.equalsIgnoreCase("RHCA-Redhat Certified Architect Training")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/rhca-red-hat-certified-architect-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "RHCA-Redhat Certified Architect Training", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("RHCVA-Redhat Certified Virtualization Administrator")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/rhcva-red-hat-certified-virtualization-administrator-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "RHCVA-Redhat Certified Virtualization Administrator", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("JBCAA-JBOSS Certified Application Administrartor")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/jbcaa-jboss-certified-application-administrator-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "JBCAA-JBOSS Certified Application Administrartor", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Vmware")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/vmware-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Vmware", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Cloud Computing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cloud-computing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Cloud Computing", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(redhat.this)
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
        //REDHAT SPINNER ENDS HERE

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

