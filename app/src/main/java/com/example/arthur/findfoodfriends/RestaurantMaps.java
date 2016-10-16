package com.example.arthur.findfoodfriends;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RestaurantMaps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_maps);
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


        // Add a marker in Yori and move the camera
        LatLng Yori = new LatLng(40.4259237, -86.92942455);
        mMap.addMarker(new MarkerOptions().position(Yori).title("Yori"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Yori));

        // Add a marker in Subway near McCutcheon and move the camera
        LatLng SubwayMcCutcheon = new LatLng(40.4261141, -86.92938767);
        mMap.addMarker(new MarkerOptions().position(SubwayMcCutcheon).title("Subway"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SubwayMcCutcheon));

        // Add a marker in Papa John near McCutcheon and move the camera
        LatLng PapaJohnMcCutcheon = new LatLng(40.4261141, -86.92938767);
        mMap.addMarker(new MarkerOptions().position(PapaJohnMcCutcheon).title("Papa John"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PapaJohnMcCutcheon));

        // Add a marker in Union and move the camera
        LatLng Union = new LatLng(40.42470371, -86.91145644);
        mMap.addMarker(new MarkerOptions().position(Union).title("Purdue Memorial Union"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Union));

        // Add a marker in Mad Mushroom Pizza and move the camera
        LatLng MadMush = new LatLng(40.42406256, -86.9089888);
        mMap.addMarker(new MarkerOptions().position(MadMush).title("Mad Mushroom Pizza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MadMush));

        // Add a marker in Einstein's Bagels and move the camera
        LatLng Einstein = new LatLng(40.42499977, -86.90810904);
        mMap.addMarker(new MarkerOptions().position(Einstein).title("Einstein Bros. Bagels"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Einstein));

        // Add a marker in Qdoba and move the camera
        LatLng Qdoba = new LatLng(40.42479355, -86.9081144);
        mMap.addMarker(new MarkerOptions().position(Qdoba).title("Qdoba Mexican Eats"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Qdoba));

        // Add a marker in Blue Nile and move the camera
        LatLng BlueNile = new LatLng(40.4245036, -86.90839604);
        mMap.addMarker(new MarkerOptions().position(BlueNile).title("Blue Nile"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BlueNile));

        // Add a marker in Pauly's and move the camera
        LatLng Pauly = new LatLng(40.42426624, -86.90899886);
        mMap.addMarker(new MarkerOptions().position(Pauly).title("Cousin Pauly's"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pauly));

        // Add a marker in Brother's Bar and Grill and move the camera
        LatLng BroGrill = new LatLng(40.4240253, -86.90840341);
        mMap.addMarker(new MarkerOptions().position(BroGrill).title("Brother's Bar & Grill"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BroGrill));

        // Add a marker in Khana Khazana and move the camera
        LatLng KhanaIndian = new LatLng(40.4242499, -86.9078549);
        mMap.addMarker(new MarkerOptions().position(KhanaIndian).title("Khana Khazana Indian Grill"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KhanaIndian));

        // Add a marker in Panda Express and move the camera
        LatLng PandaExpress = new LatLng(40.42466695, -86.90777645);
        mMap.addMarker(new MarkerOptions().position(PandaExpress).title("Panda Express"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PandaExpress));

        // Add a marker in Captain gyros and move the camera
        LatLng CptGyros = new LatLng(40.42455669, -86.90779522);
        mMap.addMarker(new MarkerOptions().position(CptGyros).title("Captain Gyros"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CptGyros));

        // Add a marker in Chipotle and move the camera
        LatLng Chipotle = new LatLng(40.4236113, -86.90718368);
        mMap.addMarker(new MarkerOptions().position(Chipotle).title("Chipotle Mexican Grill"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chipotle));

        // Add a marker in HotBox and move the camera
        LatLng HotBox = new LatLng(40.4235868, -86.90804467);
        mMap.addMarker(new MarkerOptions().position(HotBox).title("HotBox Pizza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HotBox));

        // Add a marker in Jake's Roadhouse and move the camera
        LatLng JakeRoadhouse = new LatLng(40.42339078, -86.90817609);
        mMap.addMarker(new MarkerOptions().position(JakeRoadhouse).title("Jake's Roadhouse"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JakeRoadhouse));

        // Add a marker in Five Guys and move the camera
        LatLng FiveGuys = new LatLng(40.42320497, -86.9080098);
        mMap.addMarker(new MarkerOptions().position(FiveGuys).title("Five Guys"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FiveGuys));

        // Add a marker in Basil Thai and move the camera
        LatLng Basil = new LatLng(40.42286601, -86.90786228);
        mMap.addMarker(new MarkerOptions().position(Basil).title("Basil Thai"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Basil));

        // Add a marker in AJ's and move the camera
        LatLng aj = new LatLng(40.42320905, -86.90648362);
        mMap.addMarker(new MarkerOptions().position(aj).title("AJ's Burgers & Beef"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(aj));

        // Add a marker in XXX and move the camera
        LatLng xxx = new LatLng(40.42269449, -86.90536514);
        mMap.addMarker(new MarkerOptions().position(xxx).title("Triple XXX"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(xxx));

        // Add a marker in Maje and move the camera
        LatLng Maje = new LatLng(40.42403448, -86.90715082);
        mMap.addMarker(new MarkerOptions().position(Maje).title("Maje Sushi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Maje));

        // Add a marker in Red Mango and move the camera
        LatLng RedMango = new LatLng(40.42428768, -86.90677531);
        mMap.addMarker(new MarkerOptions().position(RedMango).title("Red Mango"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RedMango));

        // Add a marker in Maru Sushi and move the camera
        LatLng MaruSushi = new LatLng(40.42446736, -86.90668412);
        mMap.addMarker(new MarkerOptions().position(MaruSushi).title("Maru Sushi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MaruSushi));

        // Add a marker in Potbelly and move the camera
        LatLng Potbelly = new LatLng(40.42452326, -86.90822873);
        mMap.addMarker(new MarkerOptions().position(Potbelly).title("Potbelly Sandwich Spot"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Potbelly));


        // Add a marker in center and move the camera
        LatLng center = new LatLng(40.423856, -86.908367);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, (float) 15.5));
    }
}
