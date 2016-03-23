package com.example.inloc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class nightlifelondon extends AppCompatActivity {


    //Declare all the used textviews created in the .xml layout files
    private TextView OneTextView;
    private TextView TwoTextView;
    private TextView ThreeTextView;
    private TextView FourTextView;
    private TextView FiveTextView;
    private TextView SixTextView;
    private TextView SevenTextView;
    private TextView EightTextView;
    private TextView NineTextView;
    private TextView TenTextView;
    private TextView ElevenTextView;
    private TextView TwelveTextView;
    private TextView ThirteenTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nightlifelondon);


        // Link previously declared TextViews to the ones defined in the layout .xml files using id.
        OneTextView = (TextView) findViewById(R.id.OneTextView);
        TwoTextView = (TextView) findViewById(R.id.TwoTextView);
        ThreeTextView = (TextView) findViewById(R.id.ThreeTextView);
        FourTextView = (TextView) findViewById(R.id.FourTextView);
        FiveTextView = (TextView) findViewById(R.id.FiveTextView);
        SixTextView = (TextView) findViewById(R.id.SixTextView);
        SevenTextView = (TextView) findViewById(R.id.SevenTextView);
        EightTextView = (TextView) findViewById(R.id.EightTextView);
        NineTextView = (TextView) findViewById(R.id.NineTextView);
        TenTextView = (TextView) findViewById(R.id.TenTextView);
        ElevenTextView = (TextView) findViewById(R.id.ElevenTextView);
        TwelveTextView = (TextView) findViewById(R.id.TwelveTextView);
        ThirteenTextView = (TextView) findViewById(R.id.ThirteenTextView);
    }
}
