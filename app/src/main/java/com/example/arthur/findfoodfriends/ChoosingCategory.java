package com.example.arthur.findfoodfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ChoosingCategory extends AppCompatActivity {

    Button dinningCourt;
    Button restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing_category);

        dinningCourt = (Button) findViewById(R.id.dinningCourt);
        dinningCourt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ChoosingCategory.this, DinningCourtMaps.class);
                startActivity(intent);
            }
        });

        restaurant = (Button) findViewById(R.id.restaurant);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ChoosingCategory.this, RestaurantMaps.class);
                startActivity(intent);
            }
        });


    }
}
