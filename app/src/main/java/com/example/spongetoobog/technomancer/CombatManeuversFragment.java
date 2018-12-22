package com.example.spongetoobog.technomancer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CombatManeuversFragment extends Fragment {
    private static final String TAG = "CombatManeuversFragment";

    private Button bullRushButton, backButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.combatmaneuversfragment_layout, container, false);
        backButton = (Button) view.findViewById((R.id.backButton));
        bullRushButton = (Button) view.findViewById(R.id.bullRushButton);

        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //TODO navigate back to Main Activity
            }
        });

        bullRushButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //TODO navigate to Bull Rush Fragment
            }
        });


        return view;

    }
}
