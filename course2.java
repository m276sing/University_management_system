package com.multisoftsystem.multisoftsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class course2 extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course2);
        web=(WebView)findViewById(R.id.web);
        web.loadUrl("https://www.itronixsolutions.com/ccna-routing-switching-training-mohali/");
    }

}
