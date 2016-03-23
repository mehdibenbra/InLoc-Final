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

public class NightLifeParisDetails extends AppCompatActivity {


    int[] Nightvisitors = {49020, 27012, 21030};      //Defines array with current amount of visitors for each

    double estimatedQueenVisitor = Nightvisitors[0]*1.07; //Estimated futur amount calculated based on evolution between 2011 and 2014
    double estimatedBlissVisitor= Nightvisitors[1]*1.04;     //Estimated futur amount calculated based on evolution between 2011 and 2014
    double estimatedBainVisitor = Nightvisitors[2]*1.04;  //Estimated futur amount calculated based on evolution between 2011 and 2014

    int  c1= (int) estimatedQueenVisitor;   //Converts the doubles defined previously into integers
    int c2 = (int) estimatedBlissVisitor;
    int c3 = (int) estimatedBainVisitor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks_paris_details);


        //Defines the array at the far left of the screen
        String [] DetailsParis = {"\n\n\n\n","Le Queen", "Bliss Kfé", "Le Bain" };






        //Convert integers to string so they can be displayed as strings in the listview
        String man2=  Integer.toString(c1);
        String man3= Integer.toString(c2);
        String man4= Integer.toString(c3);


        //Convert integers to string so they can be displayed as strings in the listview
        String in1 = Integer.toString(Nightvisitors[0]);
        String in2 = Integer.toString(Nightvisitors[1]);
        String in3 = Integer.toString(Nightvisitors[2]);


        //Defines the array at the far right of the screen
        String [] IN = {"Current amount of visitors (2016) \n",in1, in2, in3 };





        //Defines the array on the middle of the screen
        String [] man = {"Predicted amount of visitors (2017) \n",man2, man3, man4 };


        //Links the array defined earlier to a listview displayed on the screen
        ListView listView1 = (ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, IN);
        listView1.setAdapter(adapter);

        //Links the array defined earlier to a listview displayed on the screen
        ListView listView2 = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> predicted = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, man);

        listView2.setAdapter(predicted);


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











