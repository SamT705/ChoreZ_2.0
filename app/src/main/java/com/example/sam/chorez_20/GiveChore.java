package com.example.sam.chorez_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GiveChore extends AppCompatActivity {
    //Button Variable Declarations
    private Button Yardwork_give;
    private Button Housework_give;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_chore);

        //Set up for Button Yardwork
        Yardwork_give = (Button) findViewById(R.id.giveyardwork);
        Yardwork_give.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openGiveYardwork();
            }
        });

        //Set up for Button Housework
        Housework_give = (Button) findViewById(R.id.givehousework);
        Housework_give.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openGiveHousework();
            }
        });


    }

    //function to open giveyardwork tab
    public void openGiveYardwork() {
        Intent intent = new Intent(this, GiveYardwork.class);
        startActivity(intent);
    }

    //function to open give housework tab
    public void openGiveHousework() {
        Intent intent = new Intent(this, GiveHousework.class);
        startActivity(intent);
    }
}
