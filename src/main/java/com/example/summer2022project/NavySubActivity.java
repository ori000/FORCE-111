package com.example.summer2022project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NavySubActivity extends MainActivity {

    Button submarine, corvette, frigate, destroyer, carrier;
    EditText submarineT, corvetteT, frigateT, destroyerT, carrierT, moneyT;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        moneyT = (EditText) findViewById(R.id.editTextNumber7);
        moneyT.setText(valMoney);

        submarineT = (EditText) findViewById(R.id.editTextNumber2);
        submarineT.setText(valSubmarine);

        corvetteT = (EditText) findViewById(R.id.editTextNumber3);
        corvetteT.setText(valCorvette);

        frigateT = (EditText) findViewById(R.id.editTextNumber4);
        frigateT.setText(valFrigate);

        destroyerT = (EditText) findViewById(R.id.editTextNumber5);
        destroyerT.setText(valDestroyer);

        carrierT = (EditText) findViewById(R.id.editTextNumber6);
        carrierT.setText(valCarrier);

        submarine = (Button) findViewById(R.id.button8);
        submarine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 200) {
                    increaseSub();
                    decreaseMonLight_Artillary();
                    moneyT.setText(valMoney);
                    submarineT = (EditText) findViewById(R.id.editTextNumber2);
                    submarineT.setText(IncreaseSub());
                }
            }
        });
        corvette = (Button) findViewById(R.id.button9);
        corvette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 240) {
                    increaseCorvette();
                    decreaseMonHeavy();
                    moneyT.setText(valMoney);
                    corvetteT = (EditText) findViewById(R.id.editTextNumber3);
                    corvetteT.setText(IncreaseCorvette());
                }
            }
        });
        frigate = (Button) findViewById(R.id.button10);
        frigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 350) {
                    increaseFrig();
                    decreaseMonAir();
                    moneyT.setText(valMoney);
                    frigateT = (EditText) findViewById(R.id.editTextNumber4);
                    frigateT.setText(IncreaseFrig());
                }
            }
        });
        destroyer = (Button) findViewById(R.id.button11);
        destroyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 350) {
                    increaseDestroyer();
                    decreaseMonAir();
                    moneyT.setText(valMoney);
                    destroyerT = (EditText) findViewById(R.id.editTextNumber5);
                    destroyerT.setText(IncreaseDestroyer());
                }
            }
        });
        carrier = (Button) findViewById(R.id.button12);
        carrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valMoney > 400) {
                    increaseCarrier();
                    decreaseMonAtomic();
                    moneyT.setText(valMoney);
                    carrierT = (EditText) findViewById(R.id.editTextNumber6);
                    carrierT.setText(IncreaseCarrier());
                }
            }
        });

//        submarineT = (EditText) findViewById(R.id.editTextNumber2);
//        submarineT.setText(IncreaseSub());
//
//        corvetteT = (EditText) findViewById(R.id.editTextNumber3);
//        corvetteT.setText(IncreaseCorvette());
//
//        frigateT = (EditText) findViewById(R.id.editTextNumber4);
//        frigateT.setText(IncreaseFrig());
//
//        destroyerT = (EditText) findViewById(R.id.editTextNumber5);
//        destroyerT.setText(IncreaseDestroyer());
//
//        carrierT = (EditText) findViewById(R.id.editTextNumber6);
//        carrierT.setText(IncreaseCarrier());
    }
}
