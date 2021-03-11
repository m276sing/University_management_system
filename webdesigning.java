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

public class webdesigning extends AppCompatActivity {
    Spinner search1,search2,search3;
    Button btn1,btn2,btn3;
    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webdesigning);

        //WEB DESIGNING spinner
        search1 = (Spinner) findViewById (R.id.search1);
        btn1=(Button)findViewById(R.id.btn1);
        String ar[]={"Select course","Jquery","Ajax","Bootstrap","JavaScript","HTML5","CSS3","PSD to HTML"};
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
                            if (s.equalsIgnoreCase("Jquery")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/jquery-training-jalandhar/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Jquery", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Ajax")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/ajax-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Ajax", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Bootstrap")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/bootstrap-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "Bootstrap", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("JavaScript")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/java-script-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "JavaScript", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("HTML5")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/html5-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "HTML5", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("CSS3")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/css3-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "CSS3", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("PSD to HTML")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/psd-to-html-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "PSD to HTML", Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(webdesigning.this)
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
        //WEB DESIGNING SPINNER ENDS HERE

        //WEB DEVELOPMENT spinner
        search2 = (Spinner) findViewById (R.id.search2);
        btn2=(Button)findViewById(R.id.btn2);
        String ar1[]={"Select details","PHP","ASP Dotnet","J2EE-Advance Java","Ruby on Rails","Cake PHP","Wordpress","Phalcon","Laravel","Codeigniter","Angular JS","Magento","Node JS","Digital Marketing","Google Adwords","SEO"};
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
                            if (s.equalsIgnoreCase("PHP")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/php-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "PHP", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("ASP Dotnet")) {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/asp-dotnet-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(), "ASP Dotnet", Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("J2EE-Advance Java"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/advance-java-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"J2EE-Advance Java",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Ruby on Rails"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/ruby-on-rails-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Ruby on Rails",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Cake PHP"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/cake-php-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Cake PHP",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Wordpress"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/wordpress-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Wordpress",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Phalcon"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/phalcon-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Phalcon",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Laravel"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/laravel-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Laravel",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Codeigniter"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/codeigniter-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Codeigniter",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Angular JS"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/angular-js-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Angular JS",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Magento"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/magento-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Magento",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Node JS"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/node-js-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Node JS",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Digital Marketing"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/digital-marketing-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Digital Marketing",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("Google Adwords"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/google-adwords-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"Google Adwords",Toast.LENGTH_LONG).show();
                            }
                            else if(s.equalsIgnoreCase("SEO"))
                            {
                                fragment = new bigdataf();
                                b.putString("url","https://www.itronixsolutions.com/seo-training-mohali/");
                                fragment.setArguments(b);
                                Toast.makeText(getApplication(),"SEO",Toast.LENGTH_LONG).show();
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
                            new AlertDialog.Builder(webdesigning.this)
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
        //WEB DEVELOPMENT SPINNER ENDS HERE

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

