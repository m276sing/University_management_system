package com.multisoftsystem.multisoftsystem;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends AppCompatActivity {

    Button mapbtn,satbtn;
    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    float zoomLevel=16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        setUpMapIfNeeded();
        mapbtn = (Button) findViewById(R.id.mapbtn);
        satbtn = (Button) findViewById(R.id.satbtn);


        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NONE);
            }
        });


        satbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            }
        });
    }

  /*  if (mMap.getMapType() == GoogleMap.MAP_TYPE_NONE) {
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    } else {
        mMap.setMapType(GoogleMap.MAP_TYPE_NONE);
    }*/


    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }



    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near THE HOTEL.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */

    //31.326015, 75.576182
    //31.310556,75.604361
    //31.3271102, 75.59170919999997

    LatLng latlng=new LatLng(31.310556,75.604361);
    private void setUpMap() {

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng,zoomLevel));
//        mMap.isIndoorEnabled();
        mMap.addMarker(new MarkerOptions().position(new LatLng(31.310556,75.604361)).title("Country Inn"));
//        mMap.getFocusedBuilding();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        {
            Toast.makeText(getApplication(),"error",Toast.LENGTH_LONG).show();
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission.
            return;
        }
        else {
            mMap.setMyLocationEnabled(true);
        }
    }
}
