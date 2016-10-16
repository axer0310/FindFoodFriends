package com.example.arthur.findfoodfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Yolo2 extends AppCompatActivity {
    final String[] places = {
            "Wiley Dining Court",
            "Windsor Dining Court",
            "Ford Dining Court",
            "Earhart Dining Court",
            "Hillenbrand Dining Court",
            "The Gathering Place",
            "Yori",
            "Subway",
            "Papa John",
            "Purdue Memorial Union",
            "Mad Mushroom Pizza",
            "Einstein Bros. Bagels",
            "Qdoba Mexican Eats",
            "Blue Nile",
            "Cousin Pauly's",
            "Brother's Bar & Grill",
            "Khana Khazana Indian Grill",
            "Panda Express",
            "Captain Gyros",
            "Chipotle Mexican Grill",
            "HotBox Pizza",
            "Jake's Roadhouse",
            "Five Guys",
            "Basil Thai",
            "AJ's Burgers & Beef",
            "Triple XXX",
            "Maje Sushi",
            "Red Mango",
            "Maru Sushi",
            "Potbelly Sandwich Spot"
    };
    Button ok;
    Button yolo;
    TextView place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yolo2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Yolo2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        yolo = (Button) findViewById(R.id.yolo);
        yolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                place.setText(places[random.nextInt(30)]);
            }
        });
        place = (TextView) findViewById(R.id.place);
        Random random = new Random();

        place.setText(places[random.nextInt(30)]);

    }

}
