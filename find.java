package com.multisoftsystem.multisoftsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class find extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

    }
        public void maps(View v)
        {
            Intent x=new Intent(find.this,googlemaps.class);
            startActivity(x);
        }

        public void maps2(View v)
        {
            Intent x=new Intent(find.this,googlemaps2.class);
            startActivity(x);
        }
    }


