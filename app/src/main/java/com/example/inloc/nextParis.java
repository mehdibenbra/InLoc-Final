package com.example.inloc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class nextParis extends AppCompatActivity {


    ImageButton Landmark;    //Defines the Image button which is going to launch the Landmark activity for Paris
    ImageButton Night;      //Defines the Image button which is going to launch the Nightlife activity for Paris
    ImageButton Restau;      //Defines the Image button which is going to launch the Restaurants activity for Paris
    ImageButton Shopping;    //Defines the Image button which is going to launch the Shopping activity for Paris
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_paris);

        //Links image button defined previously to view with the given id (LandmarksImageButton)
        Landmark =(ImageButton)findViewById(R.id.LandmarksImageButton);
        Landmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(nextParis.this, LandmarkParis.class);
                startActivity(intent);


            }
        });


        //To launch the nightlifeParis activity when the Night button is clicked on
        Night =(ImageButton)findViewById(R.id.NightLifeImageButton);
        Night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(nextParis.this, nightlifeParis.class);
                startActivity(intent);
            }
        });



        //To launch the restaurantParis activity when the Restau button is clicked on
        Restau =(ImageButton)findViewById(R.id.restaurantImageButton);
        Restau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(nextParis.this, restaurantParis.class);
                startActivity(intent);
            }
        });

        //To launch the ShoppingParis activity when the Shopping button is clicked on
        Shopping =(ImageButton)findViewById(R.id.ShoppingImageButton);
        Shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(nextParis.this, ShoppingParis.class);
                startActivity(intent);
            }
        });
    }
}


