package com.example.summer2022project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Values{

    ImageButton barracks, navy, administration, operations, exit, listButton;
    int counter = 0;
    int valMoney = 100;
    int valNukes = 0;
    int valAtomic = 10;
    static int valPersonnel = 3000;
    int valArmored = 60;
    int valLight = 170;
    int valAircraft = 30;
    int valArtillary = 5;
    int valSubmarine = 2;
    int valDestroyer= 0;
    int valFrigate = 2;
    int valCorvette  = 3;
    int valCarrier = 1;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] List = { "Register Now","Settings","Contact Us" };
        ArrayAdapter arrayAdapter;
        listView = (ListView) findViewById(R.id.list_item);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, List);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, List[position].toString(),
                        Toast.LENGTH_LONG).show();    }
        });
        listView.setVisibility(View.GONE);
        exit = (ImageButton) findViewById(R.id.imageButton5);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        listButton = (ImageButton) findViewById(R.id.imageButton6);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter % 2 == 0)
                    listView.setVisibility(View.VISIBLE);
                else if(counter % 2 != 0)
                    listView.setVisibility(View.INVISIBLE);
                counter++;
            }
        });
        barracks = (ImageButton) findViewById(R.id.imageButton);
        barracks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        navy = (ImageButton) findViewById(R.id.imageButton2);
        navy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        administration = (ImageButton) findViewById(R.id.imageButton4);
        administration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
        operations = (ImageButton) findViewById(R.id.imageButton3);
        operations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
    public void openActivity4()
    {
        Intent intent = new Intent(MainActivity.this, FourthActivity.class);
        startActivity(intent);
    }
    public void openActivity5()
    {
        Intent intent = new Intent(MainActivity.this, FifthActivity.class);
        startActivity(intent);
    }

    @Override
    public void increaseMon() {
        valMoney += 500;
    }

    @Override
    public void increasePersonnel() {
        valPersonnel+= 3000;
    }

    @Override
    public void increaseNuke() {
        valNukes += 1;
    }

    @Override
    public void increaseAtomic() {
        valAtomic += 3;
    }

    @Override
    public void increaseLight() {
        valLight += 400;
    }

    @Override
    public void increaseArmored() {
        valArmored += 200;
    }

    @Override
    public void increaseArtillary() {
        valArtillary += 340;
    }

    @Override
    public void increaseAircraft() {
        valAircraft += 40;
    }

    @Override
    public void increaseSub() {
        valSubmarine += 6;
    }

    @Override
    public void increaseFrig() {
        valFrigate += 3;
    }

    @Override
    public void increaseCorvette() {
        valCorvette += 3;
    }

    @Override
    public void increaseDestroyer() {
        valDestroyer += 2;
    }

    @Override
    public void increaseCarrier() {
        valCarrier += 1;
    }

    @Override
    public void reDeploy() {

    }

    @Override
    public void decreaseMonPersonnel() {
        valMoney -= 100;
    }

    @Override
    public void decreaseMonLight_Artillary() {
        valMoney -= 200;
    }

    @Override
    public void decreaseMonHeavy() {
        valMoney -= 240;
    }

    @Override
    public void decreaseMonAir() {
        valMoney -= 350;
    }

    @Override
    public void decreaseMonNuke() {
        valMoney -= 500;
    }

    @Override
    public void decreaseMonAtomic() {
        valMoney -= 400;
    }

    @Override
    public void decreasePersonnel() {
        valPersonnel -= 1000;
    }

    @Override
    public void decreaseNuke() {

    }

    @Override
    public void decreaseAtomic() {

    }

    @Override
    public void decreaseLight() {
        valLight -= 100;
    }

    @Override
    public void decreaseArmored() {
        valArmored -= 80;
    }

    @Override
    public void decreaseArtillary() {
        valArtillary -= 30;
    }

    @Override
    public void decreaseAircraft() {
        valAircraft -= 60;
    }

    @Override
    public void decreaseSub() {
        valSubmarine -= 1 ;
    }

    @Override
    public void decreaseFrig() {
        valFrigate -= 1;
    }

    @Override
    public void decreaseCorvette() {
        valCorvette -= 3;
    }

    @Override
    public void decreaseDestroyer() {
        valDestroyer -=2;
    }

    @Override
    public void decreaseCarrier() {
        valCarrier -= 1;
    }

    @Override
    public int IncreasePersonnel() {
        return 3000;
    }

    @Override
    public int IncreaseLight() {
        return 400;
    }

    @Override
    public int IncreaseArmored() {
        return 200;
    }

    @Override
    public int IncreaseArtillary() {
        return 340;
    }

    @Override
    public int IncreaseAircraft() {
        return 40;
    }

    @Override
    public int IncreaseSub() {
        return 6;
    }

    @Override
    public int IncreaseFrig() {
        return 3;
    }

    @Override
    public int IncreaseCorvette() {
        return 3;
    }

    @Override
    public int IncreaseDestroyer() {
        return 2;
    }

    @Override
    public int IncreaseCarrier() {
        return 1;
    }

}