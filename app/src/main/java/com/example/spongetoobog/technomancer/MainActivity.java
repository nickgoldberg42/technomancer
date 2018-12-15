package com.example.spongetoobog.technomancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Declare Needed Stuff
    Button combatManeuverButton;
    TextView actionText;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");

        //Initialize Button
        combatManeuverButton = (Button) findViewById(R.id.combatManeuverButton);



        //Initialize Text
        actionText = (TextView) findViewById(R.id.actionText);

        combatManeuverButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    if(view == combatManeuverButton){
                        //TODO goes to Combat Maneuver Fragment
                        //openCombatManeuverFragment();
                    }
                }
            }
        );

    }
}
