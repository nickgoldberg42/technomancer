package com.example.spongetoobog.technomancer;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Declare Needed Stuff
    Button combatManeuverButton, useSkillButton, attackButton;
    TextView actionText;

    private static final String TAG = "MainActivity";
    private FragmentManager fm = getSupportFragmentManager();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");

        //Initialize Button
        combatManeuverButton = (Button) findViewById(R.id.combatManeuverButton);
        useSkillButton = (Button) findViewById(R.id.useSkillButton);
        attackButton = (Button) findViewById(R.id.attackButton);



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

        useSkillButton.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View view){
                      //TODO create Skills Fragment
                      fm.beginTransaction().replace(R.id.skillsFragment,
                      new SkillsFragment(), "fragsf").commit();
              }
          }
        );

        attackButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    if(view == attackButton){
                        //TODO create attacks Fragment
                        //openAttacksFragment();
                    }
                }
            }
        );

    }
}
