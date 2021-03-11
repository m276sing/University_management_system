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

public class cisco extends AppCompatActivity {

    Spinner search1,search2,search3;
    Button btn1,btn2,btn3;
    Fragment fragment;
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cisco);

        //CCNA spinner
        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select details","Security","Routing and Switching","Wireless","Voice","Data Center","Service Provider","Collaboration","Cloud"};
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
                            if (s.equalsIgnoreCase("Routing and Switching")) {
                                fragment = new ccna_routing();
                                Toast.makeText(getApplication(), "CCNA-Routing and Switching", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Security")) {
                                fragment = new ccna_security();
                                Toast.makeText(getApplication(), "CCNA-Security", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Wireless")) {
                                fragment = new ccna_wireless();
                                Toast.makeText(getApplication(), "CCNA-Wireless", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Voice")) {
                                fragment = new ccna_voice();
                                Toast.makeText(getApplication(), "CCNA-Voice", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Data Center")) {
                                fragment = new ccna_datacenter();
                                Toast.makeText(getApplication(), "CCNA-Data Center", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Service Provider")) {
                                fragment = new ccna_serviceprovider();
                                Toast.makeText(getApplication(), "CCNA-Service Provider", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Collaboration")) {
                                fragment = new ccna_collab();
                                Toast.makeText(getApplication(), "CCNA-Collaboration", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Cloud")) {
                                fragment = new ccna_cloud();
                                Toast.makeText(getApplication(), "CCNA-Cloud", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(cisco.this)
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
        //CCNA SPINNER ENDS HERE

        //CCNP spinner
        search2 = (Spinner) findViewById (R.id.search2);
        btn2=(Button)findViewById(R.id.btn2);
        String ar1[]={"Select details","Security","Routing and Switching","Wireless","Voice","Data Center","Service Provider","Collaboration"};
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
                        if (s.equalsIgnoreCase("Routing and Switching")) {
                            fragment=new ccnp_routing();
                            Toast.makeText(getApplication(), "CCNP-Routing and Switching", Toast.LENGTH_LONG).show();
                        }
                        else if (s.equalsIgnoreCase("Security")) {
                            fragment=new ccnp_security();
                            Toast.makeText(getApplication(), "CCNP-Security", Toast.LENGTH_LONG).show();
                        }
                        else if(s.equalsIgnoreCase("Wireless"))
                        {
                            fragment=new ccnp_wireless();
                            Toast.makeText(getApplication(),"CCNP-Wireless",Toast.LENGTH_LONG).show();
                        }
                        else if(s.equalsIgnoreCase("Voice"))
                        {
                            fragment=new ccnp_voice();
                            Toast.makeText(getApplication(),"CCNP-Voice",Toast.LENGTH_LONG).show();
                        }
                        else if(s.equalsIgnoreCase("Data Center"))
                        {
                            fragment=new ccnp_datacenter();
                            Toast.makeText(getApplication(),"CCNP-Data Center",Toast.LENGTH_LONG).show();
                        }
                        else if(s.equalsIgnoreCase("Service Provider"))
                        {
                            fragment=new ccnp_serviceprovider();
                            Toast.makeText(getApplication(),"CCNP-Service Provider",Toast.LENGTH_LONG).show();
                        }
                        else if(s.equalsIgnoreCase("Collaboration"))
                        {
                            fragment=new ccnp_collab();
                            Toast.makeText(getApplication(),"CCNP-Collaboration",Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(cisco.this)
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
        //CCNP SPINNER ENDS HERE

        //CCIE spinner
        search3 = (Spinner)findViewById (R.id.search3);
        btn3=(Button)findViewById(R.id.btn3);
        String ar3[]={"Select course","Security","Routing and Switching","Voice","Service Provider"};
        ArrayAdapter aaaa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,ar3);
        aaaa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        search3.setAdapter(aaaa);
        search3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                final String s=parent.getItemAtPosition(position).toString();
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (w = haveNetworkConnection()) {
                            if (s.equalsIgnoreCase("Routing and Switching")) {
                                fragment = new ccie_routing();
                                Toast.makeText(getApplication(), "CCIE-Routing and Switching", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Security")) {
                                fragment = new ccie_security();
                                Toast.makeText(getApplication(), "CCIE-Security", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Voice")) {
                                fragment = new ccie_voice();
                                Toast.makeText(getApplication(), "CCIE-Voice", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Service Provider")) {
                                fragment = new ccie_serviceprovider();
                                Toast.makeText(getApplication(), "CCIE-Service Provider", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(cisco.this)
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
