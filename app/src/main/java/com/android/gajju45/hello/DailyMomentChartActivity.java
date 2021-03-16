package com.android.gajju45.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DailyMomentChartActivity extends AppCompatActivity {
    List<DailyMomentChartModel> dailyMomentChartlist;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_moment_chart_activity);

        setTitle("Daily Moment Activity");
        recyclerView = (RecyclerView) findViewById(R.id.dailyChatMomentRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dailyMomentChartlist = new ArrayList<>();
        dailyMomentChartlist.add(
                new DailyMomentChartModel(
                        "tourid","tourdate","destination","agentName","leadPax","pickuptime","droptime","mode","driver","vehicleName","vehicleAllocation"
                )

        );
        dailyMomentChartlist.add(
                new DailyMomentChartModel(
                        "tourid","tourdate","destination","agentName","leadPax","pickuptime","droptime","mode","driver","vehicleName","vehicleAllocation"
                )

        );
        //creating recyclerview adapter
        DailyMomentChartAdapter adapter = new DailyMomentChartAdapter(this, dailyMomentChartlist);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
//GAJENDRA45a

    }




}