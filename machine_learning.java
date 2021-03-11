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

public class machine_learning extends AppCompatActivity {

    Spinner search1,search2,search3;
    Button btn1,btn2,btn3;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_learning);

        //MACHINE LEARNING spinner
        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select course","R Programming language","Data Mining","Data Warehousing","Artificial Intelligence","Data Science with Python","SPSS","Neural Networks","Excel with VBA","Business Analysis and Analytics","Data Science with R"};
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
                            if (s.equalsIgnoreCase("R Programming language")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/r-programming-language-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "R Programming language", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Data Mining")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/data-mining-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Data Mining", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Data Warehousing")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/data-warehousing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Data Warehousing", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Artificial Intelligence")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/artificial-intelligence-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Artificial Intelligence", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Data Science with Python")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/data-science-python-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Data Science with Python", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("SPSS")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/spss-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "SPSS", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Neural Networks")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/neural-networks-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Neural Networks", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Excel with VBA")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/excel-vba-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Excel with VBA", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Business Analysis and Analytics")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/business-analysis-analytics-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Business Analysis and Analytics", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Data Science with R")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/data-science-with-r-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Data Science with R", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(machine_learning.this)
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
        //MACHINE LEARNING SPINNER ENDS HERE
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
