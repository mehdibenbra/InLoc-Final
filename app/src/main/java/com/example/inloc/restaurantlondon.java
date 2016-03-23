package com.example.inloc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class restaurantlondon extends AppCompatActivity {


    //Declare all the used textviews created in the .xml layout files
    private TextView QuoteTextView;
    private TextView TextViewOne;
    private TextView TextViewTwo;
    private TextView TextViewThree;
    private TextView TextViewFour;
    private TextView TextViewFive;
    private TextView TextViewSix;
    private TextView TextViewSeven;
    private TextView TextViewEight;
    private TextView TextViewNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantlondon);


// Link previously declared TextViews to the ones defined in the layout .xml files using id.
        QuoteTextView = (TextView) findViewById(R.id.QuoteTextView);
        TextViewOne = (TextView) findViewById(R.id.TextViewOne);
        TextViewTwo = (TextView) findViewById(R.id.TextViewTwo);
        TextViewThree = (TextView) findViewById(R.id.TextViewThree);
        TextViewFour = (TextView) findViewById(R.id.TextViewFour);
        TextViewFive = (TextView) findViewById(R.id.TextViewFive);
        TextViewSix = (TextView) findViewById(R.id.TextViewSix);
        TextViewSeven = (TextView) findViewById(R.id.TextViewSeven);
        TextViewEight = (TextView) findViewById(R.id.TextViewEight);
        TextViewNine = (TextView) findViewById(R.id.TextViewNine);

    }
}
