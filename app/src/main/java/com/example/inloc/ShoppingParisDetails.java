package com.example.inloc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShoppingParisDetails extends AppCompatActivity {

    int[] ShoppingVisitors = {350020 , 295020, 289010};      //Defines array with current amount of visitors for each

    double estimatedChampsVisitors = ShoppingVisitors[0]*1.07; //Estimated futur amount calculated based on evolution between 2011 and 2014
    double estimatedHaussmanVisitors= ShoppingVisitors[1]*1.04;     //Estimated futur amount calculated based on evolution between 2011 and 2014
    double estimatedStHonoreVisitors = ShoppingVisitors[2]*1.04;  //Estimated futur amount calculated based on evolution between 2011 and 2014

    int  c1= (int) estimatedChampsVisitors;   //Converts the doubles defined previously into integers
    int c2 = (int) estimatedHaussmanVisitors;
    int c3 = (int) estimatedStHonoreVisitors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks_paris_details);


        //Defines the array at the far left of the screen
        String [] DetailsShopping = {"\n\n\n\n","Boulevard Haussman", "Rue Saint-Honoré", "Av.Champs-Élysées" };






        //Convert integers to string so they can be displayed as strings in the listview
        String man2=  Integer.toString(c1);
        String man3= Integer.toString(c2);
        String man4= Integer.toString(c3);


        //Convert integers to string so they can be displayed as strings in the listview
        String in1 = Integer.toString(ShoppingVisitors[0]);
        String in2 = Integer.toString(ShoppingVisitors[1]);
        String in3 = Integer.toString(ShoppingVisitors[2]);


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













        //Sort array of integers and Strings by Alphabetical order for the landmarks displayed
        Integer [] Estimatedresults = {c1,c2,c3};

        for(int i=0;i<DetailsShopping.length;i++)
        {
            for(int j=i+1;j<DetailsShopping.length;j++)
            {
                if(DetailsShopping[j].compareTo(DetailsShopping[i])<0)
                {
                    String temp = DetailsShopping[j];
                    DetailsShopping[j]=DetailsShopping[i];
                    DetailsShopping[i]=temp;

                    String caca1 = Integer.toString(Estimatedresults[0]);
                    String caca2 = Integer.toString(Estimatedresults[1]);
                    String caca3 = Integer.toString(Estimatedresults[2]);

                    String [] CACA = {caca1,caca2,caca3 };



                    ListView listView3 = (ListView) findViewById(R.id.listView3);
                    ArrayAdapter<String> sorted = new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, DetailsShopping);

                    listView3.setAdapter(sorted);
                }







            }

        }
    }
}











