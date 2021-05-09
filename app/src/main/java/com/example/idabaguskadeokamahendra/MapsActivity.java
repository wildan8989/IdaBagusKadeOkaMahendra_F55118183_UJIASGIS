package com.example.idabaguskadeokamahendra;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng hums = new LatLng(-0.8914437726403823, 119.89061627807484);
        mMap.addMarker(new MarkerOptions().position(hums).title("Saya berada Di rumah saya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hums));

        LatLng sekolah = new LatLng(-0.8912394415908801, 119.89013069876633);
        mMap.addMarker(new MarkerOptions().position(sekolah).title("SDN INPRES 1 Tanamodindi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah));


        mMap.addPolyline(new PolylineOptions().add(
                hums,
                new LatLng(-0.8914437726403823, 119.89061627807484),
                new LatLng(-0.8914643932043756, 119.89034630347862),
                new LatLng(-0.8912731843337829, 119.89030130771258),
                new LatLng(-0.8912394415908801, 119.89013069876633),

                sekolah
                ).width(10)
                        .color(Color.BLUE)

        );
    }
}