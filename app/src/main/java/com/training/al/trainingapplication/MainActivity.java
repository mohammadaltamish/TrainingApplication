package com.training.al.trainingapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends FragmentActivity {
    Button goButton;
    EditText editTextDest, editTextOrigin;
    public final static String ORIGIN = "com.training.al.trainingapplication.ORIGIN";
    public final static String DESTINATION = "com.training.al.trainingapplication.DESTINATION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate","Activity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
       Log.d("onStart","Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        goButton = (Button) findViewById(R.id.gobutton);
        editTextOrigin = (EditText) findViewById(R.id.editTextOrigin);
        editTextDest = (EditText) findViewById(R.id.editTextDest);
        Button cameraButton = (Button) findViewById(R.id.camerabutton);


        goButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String originstr = editTextOrigin.getText().toString();
                String destinationstr = editTextDest.getText().toString();
                Intent intent = new Intent(MainActivity.this, FareActivity.class);
                intent.putExtra(ORIGIN,originstr);
                intent.putExtra(DESTINATION,destinationstr);
                startActivity(intent);
                //requestPermissions(new String[]{Manifest.permission.ACCESS_CHECKIN_PROPERTIES}, 1);
               // ActivityCompat.requestPermissions(TrainingActivity.this,new String[]{android.Manifest.permission.CAMERA},1);
           // }
            }
        });
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });
       Log.d("onResume","Activity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
       Log.d("onStop","Activity onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
       Log.d("onRestart","Activity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","Activity onDestroy");
    }
}
