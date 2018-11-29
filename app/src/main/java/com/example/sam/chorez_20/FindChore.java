package com.example.sam.chorez_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindChore extends AppCompatActivity {
    //Button Variable Declarations
private Button Yardwork; //Button for Yardwork
private Button Housework; //Button for House work
private Button ChoresNearMe; //Button for finding chorez near me


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_chore);

        //Set up for Button Yardwork
        Yardwork = (Button) findViewById(R.id.yardwork);
        Yardwork.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openYardwork();
            }
        });

        //Set up for Button Housework
        Housework = (Button) findViewById(R.id.housework);
        Housework.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               openHousework();
            }
        });

    }


    //function to open yardwork tab
    public void openYardwork() {
        Intent intent = new Intent(this, Yardwork.class);
        startActivity(intent);
    }

   // function to open housework tab
    public void openHousework() {
        Intent intent = new Intent(this, Housework.class);
        startActivity(intent);
    }
}
