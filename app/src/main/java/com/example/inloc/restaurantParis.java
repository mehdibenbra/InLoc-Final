package com.example.inloc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class restaurantParis extends AppCompatActivity {

    //Declare all the used textviews created in the .xml layout files
    private TextView OneTextView;
    private TextView TwoTextView;
    private TextView ThreeTextView;
    private TextView FourTextView;
    private TextView FiveTextView;
    private TextView SixTextView;
    private TextView SevenTextView;
    private TextView EightTextView;

    Button Details2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_paris);

        // Link previously declared TextViews to the ones defined in the layout .xml files using id.
        OneTextView = (TextView) findViewById(R.id.OneTextView);
        TwoTextView = (TextView) findViewById(R.id.TwoTextView);
        ThreeTextView = (TextView) findViewById(R.id.ThreeTextView);
        FourTextView = (TextView) findViewById(R.id.FourTextView);
        FiveTextView = (TextView) findViewById(R.id.FiveTextView);
        SixTextView = (TextView) findViewById(R.id.SixTextView);
        SevenTextView = (TextView) findViewById(R.id.SevenTextView);
        EightTextView = (TextView) findViewById(R.id.EightTextView);


        //Links the defined Details button to the one in the .xml layout file
        Details2 =(Button)findViewById(R.id.DetailsButton2);

        //Functions setonClickListener and intent used to open LandmarkParisDetails after pressing the Details button
        Details2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent details2 = new Intent(restaurantParis.this, RestaurantParisDetails.class);
                startActivity(details2);
            }
        });
    }
}
