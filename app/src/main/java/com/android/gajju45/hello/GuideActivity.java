package com.android.gajju45.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends AppCompatActivity {
    List<GuideModel> guideModels;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        setTitle("Guide Activity");

        recyclerView = (RecyclerView) findViewById(R.id.guideRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        guideModels = new ArrayList<>();
        guideModels.add(
                new GuideModel(
                        "tourid","tourdate","destination","agentName","leadPax","pickuptime","droptime","mode","driver","vehicleName","vehicleAllocation"
                )

        );
        guideModels.add(
                new GuideModel(
                        "tourid","tourdate","destination","agentName","leadPax","pickuptime","droptime","mode","driver","vehicleName","vehicleAllocation"
                )

        );
        //creating recyclerview adapter
        GuideAdapter adapter = new GuideAdapter(this, guideModels);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


    }




}