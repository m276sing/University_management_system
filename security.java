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

public class security extends AppCompatActivity {

    Spinner search1;
    Button btn1;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);


        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select course","CEPT-Certified Expert Penetration Tester","ICEH-Itronix Certified Ethical Hacker","OSCP-Offensive Security Certified Professional","GPEN-GIAC Certified Penetration Tester","CompTIA-Security","CSTA-Certified Security Testing Association","CPTE-Certified Penetration Testing Engineer","CPTC-Certified Penetration Testing Consultant","CISSP-Certified Information System Security Professional","Cryptography","Certified Secure Computer User"};
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
                            if (s.equalsIgnoreCase("CEPT-Certified Expert Penetration Tester")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cept-certified-expert-penetration-tester-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "CEPT-Certified Expert Penetration Tester", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("ICEH-Itronix Certified Ethical Hacker")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/ethical-hacking-training-mohali-2/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "ICEH-Itronix Certified Ethical Hacker", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("OSCP-Offensive Security Certified Professional")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/oscp-offensive-security-certified-professional-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "OSCP-Offensive Security Certified Professional", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("GPEN-GIAC Certified Penetration Tester")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/gpen-giac-certified-penetration-tester-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "GPEN-GIAC Certified Penetration Tester", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("CSTA-Certified Security Testing Association")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/csta-certified-security-testing-associate-training-jalandhar/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "CSTA-Certified Security Testing Association", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("CompTIA-Security")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/comptia-security-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "CompTIA-Security", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("CPTE-Certified Penetration Testing Engineer")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cpte-certified-penetration-testing-engineer-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "CPTE-Certified Penetration Testing Engineer", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("CPTC-Certified Penetration Testing Consultant")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cptc-certified-penetration-testing-consultant-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "CPTC-Certified Penetration Testing Consultant", Toast.LENGTH_LONG).show();
                            }else if (s.equalsIgnoreCase("CISSP-Certified Information System Security Professional")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cissp-certified-information-systems-security-professional-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "CISSP-Certified Information System Security Professional", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Cryptography")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cryptography-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Cryptography", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Certified Secure Computer User")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/certified-secure-computer-user-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Certified Secure Computer User", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(security.this)
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
