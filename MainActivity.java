package com.multisoftsystem.multisoftsystem;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , View.OnClickListener {

    TextView name;
    ImageView img;
    ImageView img1;
    ImageView imageView1;
    Animation animat;
    ImageView imgv;
    private String imagesJSON;
    private String imagesJSON1;

    private static final String JSON_ARRAY ="result";
    private static final String JSON_ARRAY1 ="result";

    private static final String IMAGE_URL = "url";
    private static final String IMAGE_URL1 = "url";

    private JSONArray arrayImages= null;
    private JSONArray arrayImages1= null;

    int TRACK = 0;
    int TRACK1 = 0;

    static final String IMAGES_URL = "https://itronixsolutions.com/Android/partners.php";
    static final String IMAGES_URL1 = "https://itronixsolutions.com/Android/clients.php";

    private Button buttonMoveNext,buttonMoveNext1;
    private Button buttonMovePrevious,buttonMovePrevious1;
    boolean w = false;

    Button butn1,butn2,butn3,butn4,butn7,butn8,butn9,butn10;
    TextView tView1,tView2,tView3,tView4,tView5,tView6;

    Button btn16,btn,butn11,but17,img7;
    Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16;
    Button button;
    Button button1;
    Button img11;
    Spinner count;
    int tophone;

    int tophn;
    int index=0,index1=0;
    LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tView1 = (TextView) findViewById(R.id.banner);
        tView2 = (TextView) findViewById(R.id.banner1);
        tView3 = (TextView) findViewById(R.id.banner2);
        tView4 = (TextView) findViewById(R.id.banner3);
        tView5 = (TextView) findViewById(R.id.banner4);
        tView6 = (TextView) findViewById(R.id.banner5);
        img11=(Button)findViewById(R.id.img);
        img7=(Button)findViewById(R.id.img7);
        but17=(Button)findViewById(R.id.but17);
        butn11=(Button)findViewById(R.id.butn11);

        btn16=(Button)findViewById(R.id.butn16);
        butn1=(Button)findViewById(R.id.butn1);
        butn2=(Button)findViewById(R.id.butn2);
        butn3=(Button)findViewById(R.id.butn3);
        butn4=(Button)findViewById(R.id.butn4);
        butn7=(Button)findViewById(R.id.butn7);
        butn8=(Button)findViewById(R.id.butn8);
        butn9=(Button)findViewById(R.id.butn9);
        butn10=(Button)findViewById(R.id.butn10);




        //search button functioning for spinner starts here
        count = (Spinner) findViewById (R.id.search);
        btn=(Button)findViewById(R.id.btn);
        String ar[]={"Select course","Mobile App Development","Cisco Courses","Big data and Hadoop","Redhat","Machine Learning","Software Development","Web Development","Graphic Designing","Software Testing","Internet Of Things","Embedded Linux","Linux Device Drivers","Microcontroller","Certified Ethical Hacking","Mechanical Courses","Civil Courses"};
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,ar);
        aa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        count.setAdapter(aa);
        count.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                final String s=parent.getItemAtPosition(position).toString();
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (w = haveNetworkConnection()) {
                            if (s.equalsIgnoreCase("Mobile App Development")) {
                                Intent i=new Intent(MainActivity.this,mobile_app.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Mobile App Development", Toast.LENGTH_LONG).show();
                            } else if (s.equalsIgnoreCase("Big Data and Hadoop")) {
                                Intent i=new Intent(MainActivity.this,bigdata.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Big Data and Hadoop", Toast.LENGTH_LONG).show();
                            }else if (s.equalsIgnoreCase("Cisco Courses")) {
                                Intent i=new Intent(MainActivity.this,cisco.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Cisco Courses", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Redhat")) {
                                Intent i=new Intent(MainActivity.this,redhat.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Redhat",Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Machine Learning")) {
                                Intent i=new Intent(MainActivity.this,machine_learning.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Machine Learning", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Software Development")) {
                                Intent i=new Intent(MainActivity.this,software_development.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Software Development", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Graphic Designing")) {
                                Intent i=new Intent(MainActivity.this,graphic_designing.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Graphic Designing", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Web Development")) {
                                Intent i=new Intent(MainActivity.this,webdesigning.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Web Development", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Microcontroller")) {
                                Intent i=new Intent(MainActivity.this,microcontroller.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Microcontroller", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Software Testing")) {
                                Intent i=new Intent(MainActivity.this,testing.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Software Testing", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Internet Of Things")) {
                                Intent i=new Intent(MainActivity.this,iot.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Internet Of Things", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Embedded Linux")) {
                                Intent i=new Intent(MainActivity.this,embedded_linux.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Embedded Linux", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Linux Device Drivers")) {
                                Intent i=new Intent(MainActivity.this,linux_device_drivers.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Linux Device Drivers", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Certified Ethical Hacking")) {
                                Intent i=new Intent(MainActivity.this,security.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Certified Ethical Hacking", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Civil Courses")) {
                                Intent i=new Intent(MainActivity.this,civil.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Civil Courses", Toast.LENGTH_LONG).show();
                            }
                            else if (s.equalsIgnoreCase("Mechanical Courses")) {
                                Intent i=new Intent(MainActivity.this,mechanical.class);
                                startActivity(i);
                                Toast.makeText(getApplication(), "Mechanical Courses", Toast.LENGTH_LONG).show();
                            }
                            else {
                                Toast.makeText(getApplication(), "Please select correct option....", Toast.LENGTH_LONG).show();
                            }
                        }

                        else
                        {
                            new AlertDialog.Builder(MainActivity.this)
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

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent j=new Intent(MainActivity.this,course.class);
                    }
                });
            }
        });
        //search spinner ends here



        //network connection and fetch news from the database
        if (w = haveNetworkConnection())
        {
            getJSON("https://itronixsolutions.com/Android/get.php");
        }
        else
            {
        tView1.setText("Top Interview Question & Answers Designed by the Industry Professionals to attend Interview Easily!");
        tView2.setText("Comprehensive 360-degree learning solution & in-depth learning analysis, Test Your Skills Now! ");
        tView3.setText("Join Industrial Training under the guidance of industry Expert Trainer with 100% Job Assistance");
        tView4.setText("It’s a limited time Opportunity for you to enroll in a certification course before getting a hike in Price ");
        tView5.setText("We have launched 650+ new courses; choose that suits the best for your Career ");
        tView6.setText("Guaranteed Batches & Very Competitive Price for All Training Courses, Enroll Now");
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("No Internet")
                .setMessage("Please check your Internet Connection to view latest updates!!")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }



    //four buttons to pass intent to course class
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,course.class);
                startActivity(j);
            }
        });


        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kk=new Intent(MainActivity.this,course.class);
                startActivity(kk);
            }
        });


        but17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(MainActivity.this,course.class);
                startActivity(l);
            }
        });


        butn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(MainActivity.this,course.class);
                startActivity(m);
            }
        });


        //machine learning starts here
        but1=(Button)findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,machine_learning.class);
                startActivity(i);
            }
        });
        //machine learning ends here


        //data science starts here
        but2=(Button)findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,machine_learning.class);
                startActivity(i);
            }
        });
        //data science ends here



        //advanced python starts here
        but4=(Button)findViewById(R.id.but4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,python.class);
                startActivity(i);
            }
        });
        //advanced python ends here


        //AI starts here
        but5=(Button)findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,machine_learning.class);
                startActivity(i);
            }
        });
        //AI ends here


        //big data button
        but6=(Button)findViewById(R.id.but6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,bigdata.class);
                startActivity(i);
            }
        });
        //big data button ends here


        //linux device drivers button
        but7=(Button)findViewById(R.id.but7);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,linux_device_drivers.class);
                startActivity(i);
            }
        });
        //linux device drivers button ends here


        //raspberry pi button
        but8=(Button)findViewById(R.id.but8);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,embedded_linux.class);
                startActivity(i);
            }
        });
        //raspberry pi button ends here



        //internet of things button
        but9=(Button)findViewById(R.id.but9);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,iot.class);
                startActivity(i);
            }
        });
        //internet of things button ends here



        //ethical hacking button
        but10=(Button)findViewById(R.id.but10);
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,security.class);
                startActivity(i);
            }
        });
        //ethical hacking button ends here



        //laravel/codeignitor button
        but11=(Button)findViewById(R.id.but11);
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,webdesigning.class);
                startActivity(i);
            }
        });
        //laravel/codeignitor button ends here



        //java button
        but12=(Button)findViewById(R.id.but12);
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,software_development.class);
                startActivity(i);
            }
        });
        //java button ends here


        //angular button
        but13=(Button)findViewById(R.id.but13);
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,webdesigning.class);
                startActivity(i);
            }
        });
        //angular button ends here


        //redhat button
        but14=(Button)findViewById(R.id.but14);
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,redhat.class);
                startActivity(i);
            }
        });
        //redhat button ends here

        //web designing button here
        but15=(Button)findViewById(R.id.but15);
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,webdesigning.class);
                startActivity(i);
            }
        });
        //web desgining button ends here


        //business analysis button here
        but16=(Button)findViewById(R.id.but16);
        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,machine_learning.class);
                startActivity(i);
            }
        });
        //business analysis button ends here

        //angular button
        butn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,webdesigning.class);
                startActivity(i);
            }
        });
        //ends here

        //civil engineering button
        butn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,civil.class);
                startActivity(i);
            }
        });
        //ends here

        //mechanical button
        butn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,mechanical.class);
                startActivity(i);
            }
        });
        //ends here

        //testing button
        butn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,testing.class);
                startActivity(i);
            }
        });
        //ends here

        //machine learning button
        butn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,machine_learning.class);
                startActivity(i);
            }
        });
        //ends here

        //big data button
        butn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,bigdata.class);
                startActivity(i);
            }
        });
        //ends here

        //machine learning button
        butn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,machine_learning.class);
                startActivity(i);
            }
        });
        //ends here

        //sap2000 button
        butn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,civil.class);
                startActivity(i);
            }
        });
        //ends here






        //image slider begin for clients

        img = (ImageView) findViewById(R.id.imgv);
        buttonMoveNext1 = (Button) findViewById(R.id.buttonNext1);
        buttonMovePrevious1 = (Button) findViewById(R.id.buttonPrev1);
        buttonMoveNext1.setOnClickListener(this);
        buttonMovePrevious1.setOnClickListener(this);
        if (w = haveNetworkConnection()) {

            //long delay = 1000;
            //long period = 5000;
            Timer task = new Timer();
            task.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    try
                    {
                        getAllImages1();
                        moveNext1();
                    }
                    catch(Exception e)
                    {

                    }
                }
            }, 1000, 2500);
        }
        else
            {
            final int imgid[] = {R.drawable.addson, R.drawable.azari, R.drawable.b4bikes, R.drawable.bestwestern, R.drawable.brew, R.drawable.cityconsultants, R.drawable.diamonds, R.drawable.domeliindustries, R.drawable.haveli, R.drawable.hermes, R.drawable.homeess, R.drawable.janshree, R.drawable.junglegourmet, R.drawable.kalra, R.drawable.kmv, R.drawable.lakme, R.drawable.matrix, R.drawable.nainazway, R.drawable.newimage, R.drawable.nfci, R.drawable.path, R.drawable.polestar, R.drawable.rkboutique, R.drawable.simco, R.drawable.spectrumoverseas, R.drawable.svn, R.drawable.uniriseworldschool, R.drawable.velvetcard};
            final Handler h = new Handler();
            final Runnable r = new Runnable() {
                @Override
                public void run() {
                    img.setImageResource(imgid[index % imgid.length]);
                    index++;
                    try {
                        Animation am = AnimationUtils.loadAnimation(getApplication(), R.anim.class.getModifiers());
                        img.startAnimation(am);
                    } catch (Exception e) {

                    }
                }
            };
            Timer time = new Timer();
            time.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    h.post(r);
                }
            }, 1, 1500);
        }
        //image slider ends here



        //second slider partners

        img1=(ImageView)findViewById(R.id.img1);
        buttonMoveNext = (Button) findViewById(R.id.buttonNext);
        buttonMovePrevious = (Button) findViewById(R.id.buttonPrev);
        buttonMoveNext.setOnClickListener(this);
        buttonMovePrevious.setOnClickListener(this);
        if (w = haveNetworkConnection()) {

            //long delay = 1000;
            //long period = 5000;
            Timer task = new Timer();
            task.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    try
                    {
                        getAllImages();
                    moveNext();
                    }
                    catch(Exception e){

                    }
                }
            }, 1000, 2500);
        }
        else {
            final int imgid1[] = {R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q};
            final Handler hh = new Handler();
            final Runnable rr = new Runnable() {
                @Override
                public void run() {
                    img1.setImageResource(imgid1[index % imgid1.length]);
                    index1++;
                    try {
                        Animation am = AnimationUtils.loadAnimation(getApplication(), R.anim.class.getModifiers());
                        img1.startAnimation(am);
                    } catch (Exception e) {

                    }
                }
            };
            Timer time1 = new Timer();
            time1.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    hh.post(rr);
                }
            }, 1, 1500);
        }






        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // action on floating bar to query form
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Fragment newCase=new BlankFragment();
                android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content_main,newCase);
                ft.addToBackStack(null);
                ft.commit();*/
               Intent i=new Intent(MainActivity.this,query.class);
               startActivity(i);
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //news update textview moving from right to left
        TextView banner=(TextView)findViewById(R.id.banner);
        animat= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        banner.startAnimation(animat);
        TextView banner1=(TextView)findViewById(R.id.banner1);
        animat= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move1);
        banner1.startAnimation(animat);
        TextView banner2=(TextView)findViewById(R.id.banner2);
        animat= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move2);
        banner2.startAnimation(animat);
        TextView banner3=(TextView)findViewById(R.id.banner3);
        animat= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move3);
        banner3.startAnimation(animat);
        TextView banner4=(TextView)findViewById(R.id.banner4);
        animat= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move4);
        banner4.startAnimation(animat);
        TextView banner5=(TextView)findViewById(R.id.banner5);
        animat= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move5);
        banner5.startAnimation(animat);


        //moving images
        imageView1=(ImageView)findViewById(R.id.img1);

        imgv=(ImageView)findViewById(R.id.imgv);

        tophn= R.drawable.svn;
        tophone=R.drawable.c;

        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);

        ImageView imageView3=(ImageView)findViewById(R.id.imageView3);

        ImageView imageView4=(ImageView)findViewById(R.id.imageView4);

        ImageView imageView5=(ImageView)findViewById(R.id.imageView5);

        ImageView imageView6=(ImageView)findViewById(R.id.imageView6);

        ImageView imageView7=(ImageView)findViewById(R.id.imageView7);

        ImageView imageView8=(ImageView)findViewById(R.id.imageView8);

        ImageView imageView9=(ImageView)findViewById(R.id.imageView9);

        ImageView imageView10=(ImageView)findViewById(R.id.imageView10);

        ImageView imageView11=(ImageView)findViewById(R.id.imageView11);

        ImageView imageView12=(ImageView)findViewById(R.id.imageView12);

        ImageView imageView13=(ImageView)findViewById(R.id.imageView13);

        ImageView imageView14=(ImageView)findViewById(R.id.imageView14);

        ImageView imageView15=(ImageView)findViewById(R.id.imageView15);

        ImageView imageView16=(ImageView)findViewById(R.id.imageView16);

        ImageView imageView17=(ImageView)findViewById(R.id.imageView17);

        ImageView imageView20=(ImageView)findViewById(R.id.imageView20);

        ImageView imageView21=(ImageView)findViewById(R.id.imageView21);

        ImageView imageView22=(ImageView)findViewById(R.id.imageView22);

        ImageView imageView23=(ImageView)findViewById(R.id.imageView23);

        ImageView imageView24=(ImageView)findViewById(R.id.imageView24);

        ImageView imageView25=(ImageView)findViewById(R.id.imageView25);

        ImageView imageView26=(ImageView)findViewById(R.id.imageView26);

        ImageView imageView27=(ImageView)findViewById(R.id.imageView27);

        ImageView imageView28=(ImageView)findViewById(R.id.imageView28);

        ImageView imageView29=(ImageView)findViewById(R.id.imageView29);

        ImageView imageView30=(ImageView)findViewById(R.id.imageView30);

        ImageView imageView31=(ImageView)findViewById(R.id.imageView31);

        ImageView imageView32=(ImageView)findViewById(R.id.imageView32);

        ImageView imageView33=(ImageView)findViewById(R.id.imageView33);

        ImageView imageView34=(ImageView)findViewById(R.id.imageView34);

        ImageView imageView35=(ImageView)findViewById(R.id.imageView35);

        ImageView imageView36=(ImageView)findViewById(R.id.imageView36);

        ImageView imageView37=(ImageView)findViewById(R.id.imageView37);

        ImageView imageView38=(ImageView)findViewById(R.id.imageView38);

        ImageView imageView39=(ImageView)findViewById(R.id.imageView39);

        ImageView imageView40=(ImageView)findViewById(R.id.imageView40);

        ImageView imageView41=(ImageView)findViewById(R.id.imageView41);

        ImageView imageView42=(ImageView)findViewById(R.id.imageView42);

        ImageView imageView43=(ImageView)findViewById(R.id.imageView43);

        ImageView imageView44=(ImageView)findViewById(R.id.imageView44);

        ImageView imageView45=(ImageView)findViewById(R.id.imageView45);

        ImageView imageView46=(ImageView)findViewById(R.id.imageView46);

        ImageView imageView47=(ImageView)findViewById(R.id.imageView47);

        button=(Button)findViewById(R.id.button);

        button1=(Button)findViewById(R.id.button1);

        imageView2.setOnClickListener(this);

        imageView3.setOnClickListener(this);

        imageView4.setOnClickListener(this);

        imageView5.setOnClickListener(this);

        imageView6.setOnClickListener(this);

        imageView7.setOnClickListener(this);

        imageView8.setOnClickListener(this);

        imageView9.setOnClickListener(this);

        imageView10.setOnClickListener(this);

        imageView11.setOnClickListener(this);

        imageView12.setOnClickListener(this);

        imageView13.setOnClickListener(this);

        imageView14.setOnClickListener(this);

        imageView15.setOnClickListener(this);

        imageView16.setOnClickListener(this);

        imageView17.setOnClickListener(this);


        imageView20.setOnClickListener(this);

        imageView21.setOnClickListener(this);

        imageView22.setOnClickListener(this);

        imageView23.setOnClickListener(this);

        imageView24.setOnClickListener(this);

        imageView25.setOnClickListener(this);

        imageView26.setOnClickListener(this);

        imageView27.setOnClickListener(this);

        imageView28.setOnClickListener(this);

        imageView29.setOnClickListener(this);

        imageView30.setOnClickListener(this);

        imageView31.setOnClickListener(this);

        imageView32.setOnClickListener(this);

        imageView33.setOnClickListener(this);

        imageView34.setOnClickListener(this);

        imageView35.setOnClickListener(this);


        imageView36.setOnClickListener(this);

        imageView37.setOnClickListener(this);

        imageView38.setOnClickListener(this);

        imageView39.setOnClickListener(this);

        imageView40.setOnClickListener(this);

        imageView41.setOnClickListener(this);

        imageView42.setOnClickListener(this);

        imageView43.setOnClickListener(this);

        imageView44.setOnClickListener(this);

        imageView45.setOnClickListener(this);

        imageView46.setOnClickListener(this);

        imageView47.setOnClickListener(this);


        button1.setOnClickListener(this);

//take a free demo button action
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,query.class);
                startActivity(i);

            }
        });




    }

    public void onClick(View v)

    {

        if(v == buttonMoveNext1){
            if (w = haveNetworkConnection()) {
                moveNext1();
            }
        }
        if(v== buttonMovePrevious1){
            if (w = haveNetworkConnection()) {
                movePrevious1();
            }
        }
        if(v == buttonMoveNext){
            if (w = haveNetworkConnection()) {
                moveNext();
            }
        }
        if(v== buttonMovePrevious){
            if (w = haveNetworkConnection()) {
                movePrevious();
            }
        }

        //our partners horizontal scroll bar
        switch (v.getId())

        {

            case R.id.imageView2:

                imageView1.setImageResource(R.drawable.b);

                tophone = R.drawable.a;

                break;


            case R.id.imageView3:

                imageView1.setImageResource(R.drawable.c);

                tophone = R.drawable.a;

                break;


            case R.id.imageView4:

                imageView1.setImageResource(R.drawable.d);

                tophone = R.drawable.a;

                break;


            case R.id.imageView5:

                imageView1.setImageResource(R.drawable.e);

                tophone = R.drawable.a;

                break;


            case R.id.imageView6:

                imageView1.setImageResource(R.drawable.f);

                tophone = R.drawable.a;

                break;


            case R.id.imageView7:

                imageView1.setImageResource(R.drawable.g);

                tophone = R.drawable.a;

                break;

            case R.id.imageView8:

                imageView1.setImageResource(R.drawable.h);

                tophone = R.drawable.a;

                break;

            case R.id.imageView9:

                imageView1.setImageResource(R.drawable.i);

                tophone = R.drawable.a;

                break;

            case R.id.imageView10:

                imageView1.setImageResource(R.drawable.j);

                tophone = R.drawable.a;

                break;

            case R.id.imageView11:

                imageView1.setImageResource(R.drawable.k);

                tophone = R.drawable.a;

                break;

            case R.id.imageView12:

                imageView1.setImageResource(R.drawable.l);

                tophone = R.drawable.a;

                break;

            case R.id.imageView13:

                imageView1.setImageResource(R.drawable.m);

                tophone = R.drawable.a;

                break;

            case R.id.imageView14:

                imageView1.setImageResource(R.drawable.n);

                tophone = R.drawable.a;

                break;

            case R.id.imageView15:

                imageView1.setImageResource(R.drawable.o);

                tophone = R.drawable.a;

                break;

            case R.id.imageView16:

                imageView1.setImageResource(R.drawable.p);

                tophone = R.drawable.a;

                break;

            case R.id.imageView17:

                imageView1.setImageResource(R.drawable.q);

                tophone = R.drawable.a;

                break;



            case R.id.button:

                InputStream a = getResources().openRawResource(tophone);

                Bitmap whatever = BitmapFactory.decodeStream(a);

                try {


                    getApplicationContext().setWallpaper(whatever);

                } catch (IOException e) {


                    e.printStackTrace();

                }

                break;


        }

//our clients horizontal scroll bar
        switch (v.getId())

        {

            case R.id.imageView20:

                imgv.setImageResource(R.drawable.addson);

                tophn = R.drawable.a;

                break;


            case R.id.imageView21:

                imgv.setImageResource(R.drawable.azari);

                tophn = R.drawable.a;

                break;


            case R.id.imageView22:

                imgv.setImageResource(R.drawable.b4bikes);

                tophn = R.drawable.a;

                break;


            case R.id.imageView23:

                imgv.setImageResource(R.drawable.bestwestern);

                tophn = R.drawable.a;

                break;


            case R.id.imageView24:

                imgv.setImageResource(R.drawable.brew);

                tophn = R.drawable.a;

                break;


            case R.id.imageView25:

                imgv.setImageResource(R.drawable.cityconsultants);

                tophn = R.drawable.a;

                break;

            case R.id.imageView26:

                imgv.setImageResource(R.drawable.diamonds);

                tophn = R.drawable.a;

                break;

            case R.id.imageView27:

                imgv.setImageResource(R.drawable.domeliindustries);

                tophn = R.drawable.a;

                break;

            case R.id.imageView28:

                imgv.setImageResource(R.drawable.haveli);

                tophn = R.drawable.a;

                break;

            case R.id.imageView29:

                imgv.setImageResource(R.drawable.hermes);

                tophn = R.drawable.a;

                break;

            case R.id.imageView30:

                imgv.setImageResource(R.drawable.homeess);

                tophn = R.drawable.a;

                break;

            case R.id.imageView31:

                imgv.setImageResource(R.drawable.janshree);

                tophn = R.drawable.a;

                break;

            case R.id.imageView32:

                imgv.setImageResource(R.drawable.junglegourmet);

                tophn = R.drawable.a;

                break;

            case R.id.imageView33:

                imgv.setImageResource(R.drawable.kalra);

                tophn = R.drawable.a;

                break;

            case R.id.imageView34:

                imgv.setImageResource(R.drawable.kmv);

                tophn = R.drawable.a;

                break;

            case R.id.imageView35:

                imgv.setImageResource(R.drawable.lakme);

                tophn = R.drawable.a;

                break;


            case R.id.imageView36:

                imgv.setImageResource(R.drawable.matrix);

                tophn = R.drawable.a;

                break;

            case R.id.imageView37:

                imgv.setImageResource(R.drawable.nainazway);

                tophn = R.drawable.a;

                break;

            case R.id.imageView38:

                imgv.setImageResource(R.drawable.newimage);

                tophn = R.drawable.a;

                break;

            case R.id.imageView39:

                imgv.setImageResource(R.drawable.nfci);

                tophn = R.drawable.a;

                break;

            case R.id.imageView40:

                imgv.setImageResource(R.drawable.path);

                tophn = R.drawable.a;

                break;

            case R.id.imageView41:

                imgv.setImageResource(R.drawable.polestar);

                tophn = R.drawable.a;

                break;

            case R.id.imageView42:

                imgv.setImageResource(R.drawable.rkboutique);

                tophn = R.drawable.a;

                break;

            case R.id.imageView43:

                imgv.setImageResource(R.drawable.simco);

                tophn = R.drawable.a;

                break;

            case R.id.imageView44:

                imgv.setImageResource(R.drawable.spectrumoverseas);

                tophn = R.drawable.a;

                break;

            case R.id.imageView45:

                imgv.setImageResource(R.drawable.svn);

                tophn = R.drawable.a;

                break;

            case R.id.imageView46:

                imgv.setImageResource(R.drawable.uniriseworldschool);

                tophn = R.drawable.a;

                break;

            case R.id.imageView47:

                imgv.setImageResource(R.drawable.velvetcard);

                tophn = R.drawable.a;

                break;

            case R.id.button1:

                InputStream a = getResources().openRawResource(tophn);

                Bitmap whatever = BitmapFactory.decodeStream(a);

                try {


                    getApplicationContext().setWallpaper(whatever);

                } catch (IOException e) {


                    e.printStackTrace();

                }

                break;


        }


    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
            {
            super.onBackPressed();
            }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//navigation drawer items actions and intent to another activity
    private void displaySelectedItem(int id)
    {
        Fragment fragment=null;
        Bundle b=new Bundle();
        switch (id)
        {
            case R.id.Machine:
                Intent aa=new Intent(MainActivity.this,machine_learning.class);
                startActivity(aa);
                break;
            case R.id.Artificial:
                Intent bb=new Intent(MainActivity.this,machine_learning.class);
                startActivity(bb);
                break;
            case R.id.Graphics:
                Intent cc=new Intent(MainActivity.this,graphic_designing.class);
                startActivity(cc);
                break;
            case R.id.Block:
                Intent dd=new Intent(MainActivity.this,machine_learning.class);
                startActivity(dd);
                break;
            case R.id.Phthon:
                Intent ee=new Intent(MainActivity.this,python.class);
                startActivity(ee);
                break;
            case R.id.Big:
                Intent ff=new Intent(MainActivity.this,bigdata.class);
                startActivity(ff);
                break;
            case R.id.Linux:
                Intent gg=new Intent(MainActivity.this,linux_device_drivers.class);
                startActivity(gg);
                break;
            case R.id.Ras:
                Intent hh=new Intent(MainActivity.this,embedded_linux.class);
                startActivity(hh);
                break;
            case R.id.Iot:
                Intent ii=new Intent(MainActivity.this,iot.class);
                startActivity(ii);
                break;
            case R.id.Mobile:
                Intent jj=new Intent(MainActivity.this,mobile_app.class);
                startActivity(jj);
                break;
            case R.id.JAVA:
                Intent kk=new Intent(MainActivity.this,software_development.class);
                startActivity(kk);
                break;
            case R.id.Hacking:
                Intent ll=new Intent(MainActivity.this,security.class);
                startActivity(ll);
                break;
            case R.id.DataScience:
                Intent mm=new Intent(MainActivity.this,machine_learning.class);
                startActivity(mm);
                break;
            case R.id.Angular:
                Intent nn=new Intent(MainActivity.this,webdesigning.class);
                startActivity(nn);
                break;
            case R.id.Red:
                Intent oo=new Intent(MainActivity.this,redhat.class);
                startActivity(oo);
                break;
            case R.id.WebDesigning:
                Intent pp=new Intent(MainActivity.this,webdesigning.class);
                startActivity(pp);
                break;
            case R.id.Business:
                Intent qq=new Intent(MainActivity.this,machine_learning.class);
                startActivity(qq);
                break;



            case R.id.About:
                Intent j=new Intent(MainActivity.this,about.class);
                startActivity(j);
                break;
            case R.id.contact:
                Intent a=new Intent(MainActivity.this,contact.class);
                startActivity(a);
                break;
            case R.id.map:
                Intent i=new Intent(MainActivity.this,find.class);
                startActivity(i);
                break;
            case R.id.Careers:
                Intent xx=new Intent(MainActivity.this,career.class);
                startActivity(xx);
                break;
            case R.id.feedback:
                Intent c=new Intent(MainActivity.this,feedback.class);
                startActivity(c);
                break;
        }
        if(fragment!=null)
        {
            android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fl1,fragment);
            ft.commit();
        }
        DrawerLayout drawer=(DrawerLayout)findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id=item.getItemId();
        displaySelectedItem(id);
        return true;
    }

//method to fetch data
    private void getJSON(final String urlWebService) {

        class GetJSON extends AsyncTask<Void, Void, String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }


            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);

                try {
                    loadIntoListView(s);
                } catch (JSONException e)
                {
                    e.printStackTrace();
                }
            }

            @Override
            protected String doInBackground(Void... voids)
            {
                try
                {
                    URL url = new URL(urlWebService);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json + "\n");
                    }
                    return sb.toString().trim();
                }
                catch (Exception e)
                {
                    return null;
                }
            }
        }
        GetJSON getJSON = new GetJSON();
        getJSON.execute();
    }

    private void loadIntoListView(String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        String[] heroes = new String[jsonArray.length()];
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            heroes[i] = obj.getString("description");

        }

        tView1.setText(heroes[0]);
        tView2.setText(heroes[1]);
        tView3.setText(heroes[2]);
        tView4.setText(heroes[3]);
        tView5.setText(heroes[4]);
        tView6.setText(heroes[5]);
    }

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI") || ni.getTypeName().equalsIgnoreCase("MOBILE"))
            {
                if (ni.isConnected())
                    haveConnectedWifi = true;
            }

        }
        return haveConnectedWifi;


    }
    //partner database fetch
    private void extractJSON(){
        try
        {
            JSONObject jsonObject = new JSONObject(imagesJSON);
            arrayImages = jsonObject.getJSONArray(JSON_ARRAY);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    void showImage(){
        try
        {
            JSONObject jsonObject = arrayImages.getJSONObject(TRACK);
            getImage(jsonObject.getString(IMAGE_URL));
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    void moveNext(){
        if(TRACK<arrayImages.length()) {
            TRACK++;
            showImage();
        }
        if(TRACK==arrayImages.length())
        {
            TRACK=0;
        }
    }

     void movePrevious(){
        if(TRACK>0){
            TRACK--;
            showImage();
        }
    }



    void getAllImages() {
        class GetAllImages extends AsyncTask<String,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                // loading = ProgressDialog.show(MainActivity.this, "Fetching Data...","Please Wait...",true,true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //loading.dismiss();
                imagesJSON = s;
                extractJSON();
                showImage();
            }

            @Override
            protected String doInBackground(String... params) {
                String uri = params[0];
                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;
                    while((json = bufferedReader.readLine())!= null){
                        sb.append(json+"\n");
                    }

                    return sb.toString().trim();

                }catch(Exception e){
                    return null;
                }
            }
        }
        GetAllImages gai = new GetAllImages();
        gai.execute(IMAGES_URL);
    }

    void getImage(String urlToImage){
        class GetImage extends AsyncTask<String,Void,Bitmap>{
            //  ProgressDialog loading;
            @Override
            protected Bitmap doInBackground(String... params) {
                URL url = null;
                Bitmap image = null;

                String urlToImage = params[0];
                try {
                    url = new URL(urlToImage);
                    image = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return image;
            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                // loading = ProgressDialog.show(MainActivity.this,"Downloading Image...","Please wait...",true,true);
            }

            @Override
            protected void onPostExecute(Bitmap bitmap) {
                super.onPostExecute(bitmap);
                //  loading.dismiss();
                img1.setImageBitmap(bitmap);
            }
        }
        GetImage gi = new GetImage();
        gi.execute(urlToImage);
    }


    //client database fetch
    private void extractJSON1(){
        try
        {
            JSONObject jsonObject = new JSONObject(imagesJSON1);
            arrayImages1 = jsonObject.getJSONArray(JSON_ARRAY1);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    private void showImage1(){
        try
        {
            JSONObject jsonObject = arrayImages1.getJSONObject(TRACK1);
            getImage1(jsonObject.getString(IMAGE_URL1));
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    private void moveNext1(){
        if(TRACK1<arrayImages1.length()) {
            TRACK1++;
            showImage1();
        }
        if(TRACK1==arrayImages1.length())
        {
            TRACK1=0;
        }
    }

    private void movePrevious1(){
        if(TRACK1>0){
            TRACK1--;
            showImage1();
        }
    }



    private void getAllImages1() {
        class GetAllImages1 extends AsyncTask<String,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                // loading = ProgressDialog.show(MainActivity.this, "Fetching Data...","Please Wait...",true,true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //loading.dismiss();
                imagesJSON1 = s;
                extractJSON1();
                showImage1();
            }

            @Override
            protected String doInBackground(String... params) {
                String uri = params[0];
                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;
                    while((json = bufferedReader.readLine())!= null){
                        sb.append(json+"\n");
                    }

                    return sb.toString().trim();

                }catch(Exception e){
                    return null;
                }
            }
        }
        GetAllImages1 gai = new GetAllImages1();
        gai.execute(IMAGES_URL1);
    }

    private void getImage1(String urlToImage){
        class GetImage1 extends AsyncTask<String,Void,Bitmap>{
            //  ProgressDialog loading;
            @Override
            protected Bitmap doInBackground(String... params) {
                URL url = null;
                Bitmap image = null;

                String urlToImage = params[0];
                try {
                    url = new URL(urlToImage);
                    image = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return image;
            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                // loading = ProgressDialog.show(MainActivity.this,"Downloading Image...","Please wait...",true,true);
            }

            @Override
            protected void onPostExecute(Bitmap bitmap) {
                super.onPostExecute(bitmap);
                //  loading.dismiss();
                img.setImageBitmap(bitmap);
            }
        }
        GetImage1 gi = new GetImage1();
        gi.execute(urlToImage);
    }


}
