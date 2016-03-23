package com.example.inloc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;                                           //Used to save the state data
import android.view.View;                                             //Used the import widget View
import android.widget.AdapterView;                             //Used the import widget AdapterView
import android.widget.ArrayAdapter;                           //Used the import widget Array Adapter
import android.widget.AutoCompleteTextView;                   //Used the import AutoTextView widget
import android.widget.Button;                                  //Used to import Listview class
import android.widget.ImageButton;               //Used to import necessary class for Button widget
import android.widget.ListView;                                   // Used to import Listview class
import android.widget.SearchView;
import android.widget.TextView;           //Used to import TextView widget which displays text on screen




//MainActivity class for the InLoc app
public class MainActivity extends AppCompatActivity {

    public TextView EeeTextView;                //Displays "EXPLORE. ENJOY. EXPERIENCE"
    private TextView InForLoc;                    // Displays "Information For your Location"



    Button button ;                                //Defines the button
    ImageButton imgButton;                        //Defines the Image Button
    AutoCompleteTextView autoCompleteTextView;  //Defines the search bar in the Main Activity
    String[] Country_Names;                    //Calls the Array from Strings.xml - Which contains the list of cities
                                               //that can be displayed by the search bar.





    //called when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);                  // call superclass's version
        setContentView(R.layout.activity_main);             // inflate the Graphical User Interface


        // In order to get references for the programmed TextViews
        EeeTextView = (TextView) findViewById(R.id.EeeTextView);    //Look for a child view with the given id (EEETextView)
        InForLoc= (TextView) findViewById(R.id.InForLoc);              //Look for a child view with the given id (InforLoc)



        ////Get references for programmatically manipulated AutocompleteTextView
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.DestinationTextView);



        Country_Names = getResources().getStringArray(R.array.country_names);
        //Assigns Country_Names to the array located in the Ressources (strings.xml)



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Country_Names);
        autoCompleteTextView.setAdapter(adapter);
        //instance of ArrayAdapter object is created




        //Interface definition for a callback to be invoked when an item in this AutocompleteText box has been clicked.
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {


            //Defines reaction when any of the items in the string list is clicked on
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)                                     //If the User clicks on first item in list (Paris)
                {
                    Intent zero = new Intent(MainActivity.this, nextParis.class);  // Defines the intent between the Main activity and the Paris screen.
                    startActivity(zero);                          // Launches nextParis activity
                }
                else if (position == 1)                              //If the User clicks on second item in list (London)
                {
                    Intent one = new Intent(MainActivity.this, next.class);      // Defines the intent between the Main activity and the London screen.
                    startActivity(one);                                        // Launches next activity
                }
                else if (position == 2)
                {
                    Intent two = new Intent(MainActivity.this, next.class);
                    startActivity(two);
                }
                else if (position == 3)
                {
                    Intent three = new Intent(MainActivity.this, next.class);
                    startActivity(three);
                }
                else if (position == 4)
                {
                    Intent four = new Intent(MainActivity.this, next.class);
                    startActivity(four);
                }
                else if (position == 5)
                {
                    Intent five = new Intent(MainActivity.this, next.class);
                    startActivity(five);
                }
                else if (position == 6)
                {
                    Intent zab = new Intent(MainActivity.this, next.class);
                    startActivity(zab);
                }



                else
                {
                    Intent kaka = new Intent(MainActivity.this, next.class);
                    startActivity(kaka);
                }

            }
        });
    }
}


