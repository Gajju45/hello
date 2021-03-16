package com.android.gajju45.hello;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DailyMomentChartAdapter extends RecyclerView.Adapter<DailyMomentChartAdapter.DailyMomentChartViewHolder> {

    private Context mCtx;
    private List<DailyMomentChartModel> DailyMomentChartModel;

    public DailyMomentChartAdapter(Context mCtx, List<DailyMomentChartModel> dailyMomentChartModel) {
        this.mCtx = mCtx;
        DailyMomentChartModel = dailyMomentChartModel;
    }

    @NonNull
    @Override
    public DailyMomentChartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.daily_moment_chart, null);
        return new DailyMomentChartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyMomentChartViewHolder holder, int position) {
        DailyMomentChartModel dailyMomentChartModel = DailyMomentChartModel.get(position);
        holder.tourid.setText(dailyMomentChartModel.getTourid());
        holder.tourdate.setText(dailyMomentChartModel.getTourdate());
        holder.agentName.setText(dailyMomentChartModel.getAgeName());
        holder.destination.setText(dailyMomentChartModel.getDestination());
        holder.leadPax.setText(dailyMomentChartModel.getLeadPax());
        holder.pickuptime.setText(dailyMomentChartModel.getPickuptime());
        holder.droptime.setText(dailyMomentChartModel.getDroptime());
        holder.mode.setText(dailyMomentChartModel.getMode());
        holder.driver.setText(dailyMomentChartModel.getDriver());
        holder.vehicleName.setText(dailyMomentChartModel.getVehicleName());
        holder.vehicleAllocation.setText(dailyMomentChartModel.getVehicleAllocation());




    }

    @Override
    public int getItemCount() {
        return DailyMomentChartModel.size();
    }

    public class DailyMomentChartViewHolder extends RecyclerView.ViewHolder {
        TextView tourid, tourdate, destination, agentName, leadPax, pickuptime, droptime, mode, driver, vehicleName, vehicleAllocation;

        public DailyMomentChartViewHolder(@NonNull View itemView) {
            super(itemView);
            tourid = itemView.findViewById(R.id.tour_idTV);
            tourdate = itemView.findViewById(R.id.tour_dateTV);
            destination = itemView.findViewById(R.id.destinationTV);
            agentName = itemView.findViewById(R.id.agent_NameTV);
            leadPax = itemView.findViewById(R.id.lead_PaxTV);
            pickuptime = itemView.findViewById(R.id.pickupTimeTV);
            droptime = itemView.findViewById(R.id.dropTimeTV);
            mode = itemView.findViewById(R.id.modeTV);
            driver = itemView.findViewById(R.id.driverTV);
            vehicleName = itemView.findViewById(R.id.vehicleName);
            vehicleAllocation = itemView.findViewById(R.id.vehicleAllocation);


        }
    }
}
