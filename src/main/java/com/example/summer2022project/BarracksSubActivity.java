package com.example.summer2022project;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BarracksSubActivity extends MainActivity {
    
    Button personnel, armored, light, artillary, aircraft;
    EditText personnelT, armoredT, lightT, artillaryT, aircraftT, moneyT;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barracks_sub_activity);

        moneyT = (EditText) findViewById(R.id.editTextNumber);
        moneyT.setText(valMoney);

        personnelT = (EditText) findViewById(R.id.editTextNumber2);
        personnelT.setText(valPersonnel);
        armoredT = (EditText) findViewById(R.id.editTextNumber3);
        armoredT.setText(valArmored);
        lightT = (EditText) findViewById(R.id.editTextNumber4);
        lightT.setText(valLight);
        artillaryT = (EditText) findViewById(R.id.editTextNumber5);
        artillaryT.setText(valArtillary);
        aircraftT = (EditText) findViewById(R.id.editTextNumber6);
        aircraftT.setText(valAircraft);

        personnel = (Button) findViewById(R.id.button8);
        personnel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 100) {
                    increasePersonnel();
                    decreaseMonPersonnel();
                    moneyT.setText(valMoney);
                    personnelT = (EditText) findViewById(R.id.editTextNumber2);
                    personnelT.setText(IncreasePersonnel());
                }
            }
        });
        armored = (Button) findViewById(R.id.button9);
        armored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 240) {
                    increaseArmored();
                    decreaseMonHeavy();
                    moneyT.setText(valMoney);
                    armoredT = (EditText) findViewById(R.id.editTextNumber3);
                    armoredT.setText(IncreaseArmored());
                }
            }
        });
        light = (Button) findViewById(R.id.button10);
        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 200) {
                    increaseLight();
                    decreaseMonLight_Artillary();
                    moneyT.setText(valMoney);
                    lightT = (EditText) findViewById(R.id.editTextNumber4);
                    lightT.setText(IncreaseLight());
                }
            }
        });
        artillary = (Button) findViewById(R.id.button11);
        artillary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 200) {
                    increaseArtillary();
                    decreaseMonLight_Artillary();
                    moneyT.setText(valMoney);
                    artillaryT = (EditText) findViewById(R.id.editTextNumber5);
                    artillaryT.setText(IncreaseArtillary());
                }
            }
        });
        aircraft = (Button) findViewById(R.id.button12);
        aircraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 350) {
                    increaseAircraft();
                    decreaseMonAir();
                    moneyT.setText(valMoney);
                    aircraftT = (EditText) findViewById(R.id.editTextNumber6);
                    aircraftT.setText(IncreaseAircraft());
                }
            }
        });

//        personnelT = (EditText) findViewById(R.id.editTextNumber2);
//        personnelT.setText(IncreasePersonnel());
//
//        armoredT = (EditText) findViewById(R.id.editTextNumber3);
//        armoredT.setText(IncreaseArmored());
//
//        lightT = (EditText) findViewById(R.id.editTextNumber4);
//        lightT.setText(IncreaseLight());
//
//        artillaryT = (EditText) findViewById(R.id.editTextNumber5);
//        artillaryT.setText(IncreaseArtillary());
//
//        aircraftT = (EditText) findViewById(R.id.editTextNumber6);
//        aircraftT.setText(IncreaseAircraft());
    }
}
