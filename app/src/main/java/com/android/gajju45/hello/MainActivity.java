package com.android.gajju45.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Daily(View view) {
        Intent i = new Intent(getApplicationContext(), DailyMomentChartActivity.class);
        startActivity(i);
    }

    public void Driver(View view) {
        Intent i = new Intent(getApplicationContext(), DriverDutiesAcitvity.class);
        startActivity(i);
    }

    public void Guide(View view) {
        Intent i = new Intent(getApplicationContext(), GuideActivity.class);
        startActivity(i);
    }
}