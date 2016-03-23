package com.example.inloc;

//Defined in the Main Activity
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class next extends AppCompatActivity
{
    //Defines the 4 Images Buttons
    ImageButton Landmark;               //Defines the Image button which is going to launch the Landmark activity  for London
    ImageButton Nightlife;                //Defines the Image button which is going to launch the Nightlife activity for London
    ImageButton Restau;                //Defines the Image button which is going to launch the Restaurants activity for London
    ImageButton Shopping;             //Defines the Image button which is going to launch the Shopping activity for London

    //Defined in the Main Activity
    @Override



    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        //Links image button defined previously to view with the given id (LandmarksImageButton)
        Landmark =(ImageButton)findViewById(R.id.LandmarksImageButton);

        //To launch the nextLondonculture activity when the landmark button is clicked on
        Landmark.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(next.this, nextlondonculture.class);
                startActivity(intent);
            }
        });

        //To launch the nightlifelondon activity when the Nightlife button is clicked on
        Nightlife =(ImageButton)findViewById(R.id.NightLifeImageButton);
        Nightlife.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(next.this, nightlifelondon.class);
                startActivity(intent);
            }
        });

        //To launch the restaurantlondon activity when the Restau button is clicked on
        Restau =(ImageButton)findViewById(R.id.restaurantImageButton);
        Restau.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(next.this, restaurantlondon.class);
                startActivity(intent);
            }
        });


          //To launch the ShoppingLondon activity when the Shopping button is clicked on
        Shopping =(ImageButton)findViewById(R.id.ShoppingImageButton);
        Shopping.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(next.this, ShoppingLondon.class);
                startActivity(intent);
            }
        });
    }
}
