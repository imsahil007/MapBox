package com.example.sahil.map;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final long[] distance = {500000};
        ArrayList<Marker> markersinmap=new ArrayList<Marker>(
        );
        final Marker[] currentmarker = {null};

        Mapbox.getInstance(this, "pk.eyJ1IjoiaW1zYWhpbDAwNyIsImEiOiJjamx6YThjdmYxdWdvM3FwMXRha3NhNXBvIn0.BEEOPuIRxnlBcpIRq01oug");
        setContentView(R.layout.activity_main);
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        IconFactory iconFactory=IconFactory.getInstance(MainActivity.this);

        Bitmap bitmapIcon = BitmapFactory.decodeResource(getResources(), R.drawable.female);
        Icon female=iconFactory.fromBitmap(bitmapIcon);
        bitmapIcon = BitmapFactory.decodeResource(getResources(), R.drawable.male);
        Icon male=iconFactory.fromBitmap(bitmapIcon);

        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                // One way to add a marker view


ArrayList<Marker> markers=new ArrayList<Marker>();


                Marker m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(male)
                        .position(new LatLng(29.078878, 75.720636))
                        .title("Simon")
                        .snippet("male")
                );
                markers.add(m);
                //----------------
                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(male)
                        .position(new LatLng(25.681743, 85.729092
                        ))
                        .title("Prochnost")
                        .snippet("male")
                );                markers.add(m);

                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(female)
                        .position(new LatLng(25.317454, 83.972779))
                        .title("Queen")
                        .snippet("female")
                );                markers.add(m);

                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(female)
                        .position(new LatLng(24.828627, 85.670375))
                        .title("Sarah")
                        .snippet("female")
                );                markers.add(m);

                m= mapboxMap.addMarker(new MarkerOptions()
                        .icon(male)
                        .position(new LatLng(23.784184, 83.972779))
                        .title("Zuckerberg")
                        .snippet("male")
                );                markers.add(m);




                //----------------
                m= mapboxMap.addMarker(new MarkerOptions()
                        .icon(male)
                        .position(new LatLng(15.975819, 77.979486))
                        .title("John wick")
                        .snippet("male")
                );                markers.add(m);

                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(female)
                        .position(new LatLng(15.163734, 75.294641))
                        .title("Lisa")
                        .snippet("female")
                );                markers.add(m);

                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(female)
                        .position(new LatLng(16.340048, 78.147015))
                        .title("Samantha")
                        .snippet("female")
                );                markers.add(m);


                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(male)
                        .position(new LatLng(22.7196, 75.8577))
                        .title("Sam")
                        .snippet("male")
                );                markers.add(m);


                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(female)
                        .position(new LatLng(21.2787, 81.8661))
                        .title("sia")
                        .snippet("female")
                );                markers.add(m);



                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(male)
                        .position(new LatLng(21.2000,81.8555))
                        .title("charles")
                        .snippet("male")
                );                markers.add(m);


                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(male)
                        .position(new LatLng(20.1004,82.3545))
                        .title("winchester")
                        .snippet("male")
                );
                markers.add(m);

                m= mapboxMap.addMarker(new MarkerOptions()
                        .icon(female)
                        .position(new LatLng(22.4568,80.7895))
                        .title("monroe")
                        .snippet("female")
                );

                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(male)
                        .position(new LatLng(15.2993, 74.1240))
                        .title("Narendra Modi")
                        .snippet("male")
                );                markers.add(m);


                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(female)
                        .position(new LatLng(16.0000,75.0125))
                        .title("Elizabeth")
                        .snippet("female")
                );                markers.add(m);


                m=mapboxMap.addMarker(new MarkerOptions()
                        .icon(female)
                        .position(new LatLng(15.1265,74.7895))
                        .title("michele")
                        .snippet("female")
                );                markers.add(m);





                mapboxMap.setOnMarkerClickListener(new MapboxMap.OnMarkerClickListener() {

                    @Override
                    public boolean onMarkerClick(@NonNull Marker marker) {
                      try{  currentmarker[0].hideInfoWindow();}catch (Exception e){}
                        currentmarker[0] =marker;
                        LatLngBounds.Builder builder = new LatLngBounds.Builder();



                        int i=0;
                        if(!markersinmap.contains(marker))
                        {distance[0] = 500000;
                        markersinmap.clear();}
                        for (Marker m : markers) {
                            if(marker.getPosition().distanceTo(m.getPosition())<= distance[0]) {
                                markersinmap.add(m);
                                builder.include(m.getPosition());
                                i++;
                            }

                        }
                        Log.i("hey","size of bound="+markersinmap.size());
                        if(i==1){
                            markersinmap.clear();
                            CameraPosition position = new CameraPosition.Builder()
                                    .target(new LatLng(marker.getPosition().getLatitude(),marker.getPosition().getLongitude())) // Sets the new camera position
                                    .zoom(10) // Sets the zoom
                                    .tilt(30) // Set the camera tilt
                                    .build(); // Creates a CameraPosition from the builder
                            mapboxMap.animateCamera(CameraUpdateFactory
                                    .newCameraPosition(position), 600);// Builds the CameraPosition object from the buil

                            marker.showInfoWindow(mapboxMap,mapView);
                            return true;
                        }

                        distance[0] /=4;
                        LatLngBounds bounds = builder.build();

                        mapboxMap.easeCamera(CameraUpdateFactory.newLatLngBounds(bounds, 100), 300);


                        return true;



                    }
                });


            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
}