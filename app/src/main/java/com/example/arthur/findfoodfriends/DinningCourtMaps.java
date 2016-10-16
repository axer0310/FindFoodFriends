package com.example.arthur.findfoodfriends;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DinningCourtMaps extends FragmentActivity implements OnMapReadyCallback {

    String[] show = new String[6];
    String url = "http://10.186.9.239/ServerSendMsg.php";
    //String show;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinning_court_maps);
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


        // Add a marker in Purdue and move the camera
        //LatLng Purdue = new LatLng(40.42, -86.92);
        //mMap.addMarker(new MarkerOptions().position(Purdue).title("Purdue"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Purdue));


        setCorordinate();


        LatLng center = new LatLng(40.427344, -86.922010);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, (float) 14.3));
    }

    public void setCorordinate() {
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap
        Network network = new BasicNetwork(new HurlStack());

        RequestQueue mRequestQueue = new RequestQueue(cache, network);

        // Log.v("Dinning:",show);

        // Formulate the request and handle the response.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        int j = 0;
                        int spaceBefore = 0;
                        int spaceAfter = 0;
                        for (int i = 0; i < response.length(); i++) {
                            if (response.charAt(i) == ' ') {
                                spaceAfter = i;
                                show[j] = response.substring(spaceBefore, spaceAfter);
                                spaceBefore = spaceAfter;
                                j++;
                            }
                        }


                        Log.v("Dinning:", response);

                        // Add a marker in EarhartDiningCourt and move the camera
                        LatLng Earhart = new LatLng(40.42560109, -86.92500025);
                        mMap.addMarker(new MarkerOptions().position(Earhart).title("Earhart Dining Court: ").snippet("Seats available: " + show[0]));
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(Earhart));

                        // Add a marker in FordDiningCourt and move the camera
                        LatLng Ford = new LatLng(40.43206929, -86.91945881);
                        mMap.addMarker(new MarkerOptions().position(Ford).title("Ford Dining Court: ").snippet("Seats available: " + show[1]));
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ford));

                        // Add a marker in GatheringPlace and move the camera
                        LatLng GatheringPlace = new LatLng(40.42628919, -86.92318574);
                        mMap.addMarker(new MarkerOptions().position(GatheringPlace).title("The Gathering Place: ").snippet("Seats available: " + show[2]));
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(GatheringPlace));

                        // Add a marker in HillenbrandDiningCourt and move the camera
                        LatLng Hillenbrand = new LatLng(40.42660975, -86.92666322);
                        mMap.addMarker(new MarkerOptions().position(Hillenbrand).title("Hillenbrand Dining Court: ").snippet("Seats available: " + show[3]));
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(Hillenbrand));


                        // Add a marker in WileyDiningCourt and move the camera
                        LatLng Wiley = new LatLng(40.42849634, -86.92104131);
                        mMap.addMarker(new MarkerOptions().position(Wiley).title("Wiley Dining Court: ").snippet("Seats available: " + show[4]));
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(Wiley));

                        // Add a marker in WindsorDiningCourt and move the camera
                        LatLng Windsor = new LatLng(40.42690377, -86.92095548);
                        mMap.addMarker(new MarkerOptions().position(Windsor).title("Windsor Dining Court: ").snippet("Seats available: " + show[5]));
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(Windsor));


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        show[0] = "error";
                        Log.e("Dinning:", error.toString());
                    }
                });

        mRequestQueue.add(stringRequest);
        mRequestQueue.start();
    }


}


