package com.example.salah.chronometer;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Chronometer chronometer;
    Button start, stop, restart,setFormat, clearFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Chronometer chronometer = (Chronometer)findViewById(R.id.chronometer1);

        //  initiate the button
        start = (Button)findViewById(R.id.button);
        stop = (Button)findViewById(R.id.button2);
        restart = (Button)findViewById(R.id.button3);
        setFormat = (Button)findViewById(R.id.button4);
        clearFormat = (Button)findViewById(R.id.button5);
       // perform on click
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.start();

                Toast.makeText(getApplication(),"Start", Toast.LENGTH_LONG).show();

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();
                Toast.makeText(getApplication(),"Stop", Toast.LENGTH_LONG).show();

            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                Toast.makeText(getApplication(),"Restart", Toast.LENGTH_LONG).show();

            }
        });
        setFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.setFormat("Time (%s)");
                Toast.makeText(getApplication(),"Set Format", Toast.LENGTH_LONG).show();

            }
        });
        clearFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.setFormat(null);
                Toast.makeText(getApplication(),"Clear Format", Toast.LENGTH_LONG).show();

            }
        });

    }
}
