package com.example.sam.chorez_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    private Button GiveChore;   //Variable for Button to give chore
    private Button FindChore; //Variable for Button to Find chore
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
//Set up so when Give Chore button is hit, go to that page
        GiveChore = (Button) findViewById(R.id.givechore);
        GiveChore.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openGiveChore();
            }
        });

//Set up so when Find Chore button is hit, go to that page

        FindChore = (Button) findViewById(R.id.findchore);
        FindChore.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openFindChore();
            }
        });

    }
//function for give chore
    public void openGiveChore() {
        Intent intent = new Intent(this, GiveChore.class);
        startActivity(intent);
    }
//function to find chore
    public void openFindChore() {
        Intent intent = new Intent(this, FindChore.class);
        startActivity(intent);
    }

}
