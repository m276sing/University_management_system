package com.multisoftsystem.multisoftsystem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class python extends AppCompatActivity {

    Fragment fragment=null;
    Bundle b=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);


        fragment = new bigdataf();
        b.putString("url","https://www.itronixsolutions.com/python-training-mohali/");
        fragment.setArguments(b);
        Toast.makeText(getApplication(), "Python Advanced", Toast.LENGTH_LONG).show();
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.web, fragment);
        ft.commit();
    }

}
