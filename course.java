package com.multisoftsystem.multisoftsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class course extends AppCompatActivity {

    Button btn16,but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16,but17,but18,but19,but20,but21,but22,but23,but24,but25,but26,but27,but28,but29,but30,but31;
    Button but32,but35,but36,but39,but40,but41,but42,but49,but50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Fragment newCase=new BlankFragment();
                android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content_main,newCase);
                ft.addToBackStack(null);
                ft.commit();*/
                Intent i=new Intent(course.this,query.class);
                startActivity(i);
            }
        });

        //last button for booking training
        btn16=(Button)findViewById(R.id.butn16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,query.class);
                startActivity(i);

            }
        });
        //booking button ends here



        //autocad button starts here
        but1=(Button)findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,mechanical.class);
                startActivity(i);
            }
        });
        //autocad button ends here

        //embedded linux button
        but2=(Button)findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,embedded_linux.class);
                startActivity(i);
            }
        });
        //embedded linux button ends here

        //data engineering button
        but3=(Button)findViewById(R.id.but3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,machine_learning.class);
                startActivity(i);
            }
        });
        //data engineering button ends here


        //civil button starts here
        but4=(Button)findViewById(R.id.but4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,civil.class);
                startActivity(i);
            }
        });
        //civil button ends here

        //microcontroller button starts here
        but5=(Button)findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,microcontroller.class);
                startActivity(i);
            }
        });
        //microcontroler button ends here


        //primavera button starts here
        but6=(Button)findViewById(R.id.but6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,civil.class);
                startActivity(i);
            }
        });
        ///primavera button ends here


        //sap button starts here
        but11=(Button)findViewById(R.id.but11);
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,civil.class);
                startActivity(i);
            }
        });
        //sap button ends here


        //mechanical button
        but12=(Button)findViewById(R.id.but12);
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,mechanical.class);
                startActivity(i);
            }
        });
        //mechanical button ends here



        //mobile app button
        but13=(Button)findViewById(R.id.but13);
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,mobile_app.class);
                startActivity(i);
            }
        });
        //mobile app button ends here

        //software development
        but14=(Button)findViewById(R.id.but14);
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,software_development.class);
                startActivity(i);
            }
        });
        //buttton ends here


        //artificial intelligence starts here
        but15=(Button)findViewById(R.id.but15);
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,machine_learning.class);
                startActivity(i);
            }
        });
        //artificial intelligence ends here


        //business intelligence starts here
        but16=(Button)findViewById(R.id.but16);
        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,machine_learning.class);
                startActivity(i);
            }
        });
        //business intelligence ends here

        //machine learning starts here
        but17=(Button)findViewById(R.id.but17);
        but17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,machine_learning.class);
                startActivity(i);
            }
        });
        //machine learning ends here


        //data science starts here
        but18=(Button)findViewById(R.id.but18);
        but18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,machine_learning.class);
                startActivity(i);
            }
        });
        //data science ends here



        //advanced python starts here
        but20=(Button)findViewById(R.id.but20);
        but20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,python.class);
                startActivity(i);
            }
        });
        //advanced python ends here


        //AI starts here
        but21=(Button)findViewById(R.id.but21);
        but21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,machine_learning.class);
                startActivity(i);
            }
        });
        //AI ends here


        //big data button
        but22=(Button)findViewById(R.id.but22);
        but22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,bigdata.class);
                startActivity(i);
            }
        });
        //big data button ends here


        //linux device drivers button
        but23=(Button)findViewById(R.id.but23);
        but23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,linux_device_drivers.class);
                startActivity(i);
            }
        });
        //linux device drivers button ends here


        //raspberry pi button
        but24=(Button)findViewById(R.id.but24);
        but24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,embedded_linux.class);
                startActivity(i);
            }
        });
        //raspberry pi button ends here



        //internet of things button
        but25=(Button)findViewById(R.id.but25);
        but25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,iot.class);
                startActivity(i);
            }
        });
        //internet of things button ends here



        //ethical hacking button
        but26=(Button)findViewById(R.id.but26);
        but26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,security.class);
                startActivity(i);
            }
        });
        //ethical hacking button ends here



        //laravel/codeignitor button
        but27=(Button)findViewById(R.id.but27);
        but27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,webdesigning.class);
                startActivity(i);
            }
        });
        //laravel/codeignitor button ends here



        //java button
        but28=(Button)findViewById(R.id.but28);
        but28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,software_development.class);
                startActivity(i);
            }
        });
        //java button ends here


        //angular button
        but29=(Button)findViewById(R.id.but29);
        but29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,webdesigning.class);
                startActivity(i);
            }
        });
        //angular button ends here


        //redhat button
        but30=(Button)findViewById(R.id.but30);
        but30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,redhat.class);
                startActivity(i);
            }
        });
        //redhat button ends here

        //web designing button here
        but31=(Button)findViewById(R.id.but31);
        but31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,webdesigning.class);
                startActivity(i);
            }
        });
        //web desgining button ends here


        //business analysis button here
        but32=(Button)findViewById(R.id.but32);
        but32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,machine_learning.class);
                startActivity(i);
            }
        });
        //business analysis button ends here


        //cloud computing button here
        but35=(Button)findViewById(R.id.but35);
        but35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,redhat.class);
                startActivity(i);
            }
        });
        //cloud computing button ends here


        //digital marketing button here
        but36=(Button)findViewById(R.id.but36);
        but36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,webdesigning.class);
                startActivity(i);
            }
        });
        //digital marketing button ends here


        //embedded button here
        but39=(Button)findViewById(R.id.but39);
        but39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,microcontroller.class);
                startActivity(i);
            }
        });
        //embedded button ends here


        //cisco button
        but40=(Button)findViewById(R.id.but40);
        but40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,cisco.class);
                startActivity(i);
            }
        });
        //cisco button ends here

        //graphic designing button
        but41=(Button)findViewById(R.id.but41);
        but41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,graphic_designing.class);
                startActivity(i);
            }
        });
        //graphic designing button ends here

        //software testing button
        but42=(Button)findViewById(R.id.but42);
        but42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,testing.class);
                startActivity(i);
            }
        });
        //software testing button ends

        //robotics button
        but49=(Button)findViewById(R.id.but49);
        but49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,microcontroller.class);
                startActivity(i);
            }
        });
        //robotics button ends

        //six sigma button
        but50=(Button)findViewById(R.id.but50);
        but50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(course.this,testing.class);
                startActivity(i);
            }
        });
        //six sigma button ends




    }

}
