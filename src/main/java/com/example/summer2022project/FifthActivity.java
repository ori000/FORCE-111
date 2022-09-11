package com.example.summer2022project;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.ScaleAnimation;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends MainActivity {

    ImageView imageView;
    Button attack1, attack2, attack3, attack4, attack5;
    private ScaleGestureDetector scaleGestureDetector;
    private float mScaleFactor = 1.0f;
    ImageButton returnButton;
    private static final String TAG = "FifthActivity";
    private float mScale = 1f;
    private ScaleGestureDetector mScaleGestureDetector;
    GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        // Customize the back button
        actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        imageView=findViewById(R.id.imageView);
        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());
        gestureDetector = new GestureDetector(this, new GestureListener());

        mScaleGestureDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.SimpleOnScaleGestureListener(){
            @Override
            public boolean onScale(ScaleGestureDetector detector) {
                float scale = 1 - detector.getScaleFactor();
                float prevScale = mScale;
                mScale += scale;

                if (mScale > 10f)
                    mScale = 10f;

                ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale, 1f / mScale, 1f / prevScale, 1f / mScale, detector.getFocusX(), detector.getFocusY());
                scaleAnimation.setDuration(0);
                scaleAnimation.setFillAfter(true);
                ScrollView layout = (ScrollView) findViewById(R.id.scrollView);
                layout.startAnimation(scaleAnimation);
                return true;
            }
        });

        attack1 = (Button) findViewById(R.id.button13);
        attack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        if (!isFinishing()){
                            new AlertDialog.Builder(FifthActivity.this)
                                    .setTitle("Enemy Forces:")
                                    .setMessage("Personnel: 4000" +
                                            "Light Armored Vehicles: 90" +
                                            "Heavy Armored Vehicles: 20" +
                                            "Towed Artillary: 40" +
                                            "Aircrafts: 4" +
                                            "Submarines: 0" +
                                            "Frigates: 0" +
                                            "Corvettes: 0" +
                                            "Destroyers: 0" +
                                            "Carriers: 0")

                                    .setCancelable(false)
                                    .setPositiveButton("Attack", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // Whatever...
                                        }
                                    }).show();
                        }
                    }
                });

                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();

                decreaseSub();
                decreaseFrig();
            }
        });
        attack2 = (Button) findViewById(R.id.button15);
        attack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        if (!isFinishing()){
                            new AlertDialog.Builder(FifthActivity.this)
                                    .setTitle("Your Alert")
                                    .setMessage("Personnel: 12000" +
                                            "Light Armored Vehicles: 0" +
                                            "Heavy Armored Vehicles: 230" +
                                            "Towed Artillary: 300" +
                                            "Aircrafts: 20" +
                                            "Submarines: 0" +
                                            "Frigates: 0" +
                                            "Corvettes: 0" +
                                            "Destroyers: 0" +
                                            "Carriers: 0")
                                    .setCancelable(false)
                                    .setPositiveButton("Attack", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // Whatever...
                                        }
                                    }).show();
                        }
                    }
                });

                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();
                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();

                decreaseSub();
                decreaseFrig();
                decreaseCorvette();
                decreaseDestroyer();
            }
        });
        attack3 = (Button) findViewById(R.id.button16);
        attack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        if (!isFinishing()){
                            new AlertDialog.Builder(FifthActivity.this)
                                    .setTitle("Enemy Forces:")
                                    .setMessage("Personnel: 14000" +
                                            "Light Armored Vehicles: 400" +
                                            "Heavy Armored Vehicles: 300" +
                                            "Towed Artillary: 120" +
                                            "Aircrafts: 60" +
                                            "Submarines: 10" +
                                            "Frigates: 0" +
                                            "Corvettes: 0" +
                                            "Destroyers: 2" +
                                            "Carriers: 1")
                                    .setCancelable(false)
                                    .setPositiveButton("Attack", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // Whatever...
                                        }
                                    }).show();
                        }
                    }
                });

                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();
                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();
                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();

                decreaseSub();
                decreaseFrig();
                decreaseSub();
                decreaseFrig();
                decreaseCorvette();
                decreaseDestroyer();
                decreaseCarrier();
            }
        });
        attack4 = (Button) findViewById(R.id.button17);
        attack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        if (!isFinishing()){
                            new AlertDialog.Builder(FifthActivity.this)
                                    .setTitle("Enemy Forces:")
                                    .setMessage("Personnel: 24000" +
                                            "Light Armored Vehicles: 100" +
                                            "Heavy Armored Vehicles: 400" +
                                            "Towed Artillary: 400" +
                                            "Aircrafts: 100" +
                                            "Submarines: 0" +
                                            "Frigates: 10" +
                                            "Corvettes: 4" +
                                            "Destroyers: 4" +
                                            "Carriers: 2")
                                    .setCancelable(false)
                                    .setPositiveButton("Attack", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // Whatever...
                                        }
                                    }).show();
                        }
                    }
                });

                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();
                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();
                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();

                decreaseSub();
                decreaseFrig();
                decreaseCorvette();
                decreaseDestroyer();
                decreaseCarrier();
                decreaseFrig();
                decreaseCorvette();
                decreaseDestroyer();
            }
        });
        attack5 = (Button) findViewById(R.id.button18);
        attack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        if (!isFinishing()){
                            new AlertDialog.Builder(FifthActivity.this)
                                    .setTitle("Enemy Forces:")
                                    .setMessage("Personnel: 20000" +
                                            "Light Armored Vehicles: 800" +
                                            "Heavy Armored Vehicles: 700" +
                                            "Towed Artillary: 0" +
                                            "Aircrafts: 170" +
                                            "Submarines: 20" +
                                            "Frigates: 10" +
                                            "Corvettes: 10" +
                                            "Destroyers: 0" +
                                            "Carriers: 0")
                                    .setCancelable(false)
                                    .setPositiveButton("Attack", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // Whatever...
                                        }
                                    }).show();
                        }
                    }
                });

                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();
                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();
                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();
                decreasePersonnel();
                decreaseArmored();
                decreaseArtillary();
                decreaseLight();
                decreaseAircraft();

                decreaseSub();
                decreaseFrig();
                decreaseCorvette();
                decreaseDestroyer();
                decreaseCarrier();
                decreaseCarrier();
                decreaseSub();
                decreaseSub();
                decreaseFrig();
                decreaseFrig();
                decreaseCorvette();
                decreaseDestroyer();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        scaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }
    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            mScaleFactor *= scaleGestureDetector.getScaleFactor();
            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor, 10.0f));
            imageView.setScaleX(mScaleFactor);
            imageView.setScaleY(mScaleFactor);
            return true;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        super.dispatchTouchEvent(event);
        mScaleGestureDetector.onTouchEvent(event);
        gestureDetector.onTouchEvent(event);
        return gestureDetector.onTouchEvent(event);
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onDown(MotionEvent e) {

            return true;
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            return true;
        }
    }
}
