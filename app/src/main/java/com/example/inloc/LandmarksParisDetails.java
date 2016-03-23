package com.example.inloc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


//This activity aims to give General details on the amount of tourists for each landmark
public class LandmarksParisDetails extends AppCompatActivity {



    int[] LandmarkVisitors = {9260000, 7260000, 6180000};      //Defines array with current amount of visitors for each

    double estimatedToureiffeilvisitors = LandmarkVisitors[0]*1.07; //Estimated futur amount calculated based on evolution between 2011 and 2014
    double estimatedLouvresVisitors= LandmarkVisitors[1]*1.04;     //Estimated futur amount calculated based on evolution between 2011 and 2014
    double estimatedNotredameVisitors = LandmarkVisitors[2]*1.04;  //Estimated futur amount calculated based on evolution between 2011 and 2014

    int  c1= (int) estimatedToureiffeilvisitors;   //Converts the doubles defined previously into integers
    int c2 = (int) estimatedLouvresVisitors;
    int c3 = (int) estimatedNotredameVisitors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks_paris_details);


        //Defines the array at the far left of the screen
        String [] DetailsParis = {"\n\n\n\n","Tour Eiffeil", "Musee du Louvres", "Notre Dame" };






        //Convert integers to string so they can be displayed as strings in the listview
        String man2=  Integer.toString(c1);
        String man3= Integer.toString(c2);
        String man4= Integer.toString(c3);


        //Convert integers to string so they can be displayed as strings in the listview
        String in1 = Integer.toString(LandmarkVisitors[0]);
        String in2 = Integer.toString(LandmarkVisitors[1]);
        String in3 = Integer.toString(LandmarkVisitors[2]);


        //Defines the array at the far right of the screen
        String [] IN = {"Predicted amount of visitors (2017) \n",in1, in2, in3 };

        //Links the array defined earlier to a listview displayed on the screen
        ListView listView1 = (ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> predicted = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, IN);

        listView1.setAdapter(predicted);




        //Defines the array on the middle of the screen
        String [] man = {"Current amount of visitors (2016) \n",man2, man3, man4 };


      //Links the array defined earlier to a listview displayed on the screen
        ListView listView2 = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, man);
        listView2.setAdapter(adapter);

        String [] Ranking = {"\n\n\n ","Tour Eiffeil", "Musee du Louvres", "Notre Dame" };










        //Sort array of integers and Strings by Alphabetical order for the landmarks displayed
        Integer [] Estimatedresults = {c1,c2,c3};

        for(int i=0;i<DetailsParis.length;i++)
        {
            for(int j=i+1;j<DetailsParis.length;j++)
            {
                if(DetailsParis[j].compareTo(DetailsParis[i])<0)
                {
                    String temp = DetailsParis[j];
                    DetailsParis[j]=DetailsParis[i];
                    DetailsParis[i]=temp;

            String caca1 = Integer.toString(Estimatedresults[0]);
            String caca2 = Integer.toString(Estimatedresults[1]);
            String caca3 = Integer.toString(Estimatedresults[2]);

            String [] CACA = {caca1,caca2,caca3 };



            ListView listView3 = (ListView) findViewById(R.id.listView3);
            ArrayAdapter<String> sorted = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, DetailsParis);

            listView3.setAdapter(sorted);
        }







    }

        }
    }
}











