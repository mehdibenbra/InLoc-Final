package com.example.inloc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RestaurantParisDetails extends AppCompatActivity {


    double [] Restaurantstars = {5, 4.2, 4};      //Defines array with current amount of visitors for each

    double estimatedSebstars = Restaurantstars[0]*1; //Estimated futur amount calculated based on evolution between 2011 and 2014
    double estimatedCobeaStars= Restaurantstars[1]*1.04;     //Estimated futur amount calculated based on evolution between 2011 and 2014
    double estimatedSixiemStars = Restaurantstars[2]*1.04;  //Estimated futur amount calculated based on evolution between 2011 and 2014

    double  c1= (double) estimatedSebstars;   //Converts the doubles defined previously into integers
    double c2 = (double) estimatedCobeaStars;
    double c3 = (double) estimatedSixiemStars;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks_paris_details);


        //Defines the array at the far left of the screen
        String [] DetailRestaurant = {"\n\n\n\n","Seb'on", "Cobea", "Le Sixieme Sens" };






        //Convert integers to string so they can be displayed as strings in the listview
        String man2=  Double.toString(c1);
        String man3= Double.toString(c2);
        String man4= Double.toString(c3);


        //Convert integers to string so they can be displayed as strings in the listview
        String in1 = Double.toString(Restaurantstars[0]);
        String in2 = Double.toString(Restaurantstars[1]);
        String in3 = Double.toString(Restaurantstars[2]);


        //Defines the array at the far right of the screen
        String [] IN = {"Current amount of stars (2016) \n",in1, in2, in3 };





        //Defines the array on the middle of the screen
        String [] man = {"Predicted amount of stars (2017) \n",man2, man3, man4 };


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
        Double [] Estimatedresults = {c1,c2,c3};

        for(int i=0;i<DetailRestaurant.length;i++)
        {
            for(int j=i+1;j<DetailRestaurant.length;j++)
            {
                if(DetailRestaurant[j].compareTo(DetailRestaurant[i])<0)
                {
                    String temp = DetailRestaurant[j];
                    DetailRestaurant[j]=DetailRestaurant[i];
                    DetailRestaurant[i]=temp;

                    String caca1 = Double.toString(Estimatedresults[0]);
                    String caca2 = Double.toString(Estimatedresults[1]);
                    String caca3 = Double.toString(Estimatedresults[2]);

                    String [] CACA = {caca1,caca2,caca3 };



                    ListView listView3 = (ListView) findViewById(R.id.listView3);
                    ArrayAdapter<String> sorted = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, DetailRestaurant);

                    listView3.setAdapter(sorted);
                }







            }

        }
    }
}











