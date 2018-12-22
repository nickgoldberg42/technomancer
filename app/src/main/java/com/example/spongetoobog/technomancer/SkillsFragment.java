package com.example.spongetoobog.technomancer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SkillsFragment extends Fragment {
    private static final String TAG = "SkillsFragment";

    private Button diplomacyButton, backButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.skillsfragment_layout, container, false);
        backButton = (Button) view.findViewById((R.id.backButton));
        diplomacyButton = (Button) view.findViewById(R.id.diplomacyButton);

        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //TODO navigate back to Main Activity
            }
        });

        diplomacyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //TODO navigate to Diplomacy Fragment
            }
        });


        return view;

    }
}
