package com.multisoftsystem.multisoftsystem;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class iot extends AppCompatActivity {

    Fragment fragment=null;
    Bundle b=new Bundle();
    boolean w = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iot);

        if (w = haveNetworkConnection()) {
            fragment = new bigdataf();
            b.putString("url", "https://www.itronixsolutions.com/iot-training-mohali/");
            fragment.setArguments(b);
            Toast.makeText(getApplication(), "Internet of Things", Toast.LENGTH_LONG).show();
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.web, fragment);
            ft.commit();
        }
        else
        {
            new AlertDialog.Builder(iot.this)
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
