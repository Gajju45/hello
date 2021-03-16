package com.android.gajju45.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DriverDutiesAcitvity extends AppCompatActivity {
    List<DriverDutiesModel> driverDutiesList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_duties_acitvity);
        setTitle("Driver Dutie Activity");

        recyclerView = (RecyclerView) findViewById(R.id.DriverDutiesRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        driverDutiesList = new ArrayList<>();
        driverDutiesList.add(
                new DriverDutiesModel(
                        "tourid","tourdate","destination","agentName","leadPax","pickuptime","droptime","mode","driver","vehicleName","vehicleAllocation"
                )

        );

        DriverDutiesAdapter adapter = new DriverDutiesAdapter(this, driverDutiesList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}