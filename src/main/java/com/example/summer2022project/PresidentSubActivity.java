package com.example.summer2022project;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;

public class PresidentSubActivity extends MainActivity {

    Chip financial, atomic, nuclear, redeploy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.president_sub_activity);
        financial = (Chip) findViewById(R.id.chip16);
        financial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney < 500)
                   increaseMon();
                else System.out.println("You have enough money.");
            }
        });
        nuclear = (Chip) findViewById(R.id.chip17);
        nuclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valNukes < 3)
                    increaseNuke();
                else System.out.println("You have enough nukes.");
            }
        });
        atomic = (Chip) findViewById(R.id.chip18);
        atomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valAtomic < 3)
                    increaseAtomic();
                else System.out.println("You have enough atomic bombs.");
            }
        });
        redeploy = (Chip) findViewById(R.id.chip19);
        redeploy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valPersonnel < 1000 && valMoney < 400 && valAircraft < 20 && valArmored < 40)
                    reDeploy();
                else System.out.println("You seem as the best fit for the current position.");
            }
        });

    }
}
