package com.training.al.trainingapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FareActivity extends AppCompatActivity {
    TextView originTV;
    TextView destTV;
    String lyftnumber = "8176179467";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        originTV = (TextView) findViewById(R.id.textViewOrigin);
        destTV = (TextView) findViewById(R.id.textViewDest);

        Bundle b = getIntent().getExtras();
        if(b!= null){
            String origin = b.getString(MainActivity.ORIGIN);
            String destination = b.getString(MainActivity.DESTINATION);
            originTV.setText("Origin: "+origin);
            destTV.setText("Destination: "+destination);

            //implicit intent to call lyft on click of button
            Button callLyft = (Button) findViewById(R.id.getlyft);
            callLyft.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:"+ lyftnumber));
                    startActivity(i);
                }
            });
        }
        else{
            Log.d("Bundle:  ", "NULL");
        }

    }
}
