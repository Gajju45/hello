package com.android.gajju45.hello;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DriverDutiesAdapter extends RecyclerView.Adapter<DriverDutiesAdapter.DriverDutiesViewHolder> {

    private Context mCtx;
    private List<DriverDutiesModel> driverDutiesModels;

    public DriverDutiesAdapter(Context mCtx, List<DriverDutiesModel> driverDutiesModels) {
        this.mCtx = mCtx;
        this.driverDutiesModels = driverDutiesModels;
    }

    @NonNull
    @Override
    public DriverDutiesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.driver_duties, null);
        return new DriverDutiesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DriverDutiesViewHolder holder, int position) {
        DriverDutiesModel driverDutiesModel = driverDutiesModels.get(position);
        holder.tourid.setText(driverDutiesModel.getTourid());
        holder.tourdate.setText(driverDutiesModel.getTourdate());
        holder.agentName.setText(driverDutiesModel.getAgeName());
        holder.destination.setText(driverDutiesModel.getDestination());
        holder.leadPax.setText(driverDutiesModel.getLeadPax());
        holder.pickuptime.setText(driverDutiesModel.getPickuptime());
        holder.droptime.setText(driverDutiesModel.getDroptime());
        holder.mode.setText(driverDutiesModel.getMode());
        holder.driver.setText(driverDutiesModel.getDriver());
        holder.vehicleName.setText(driverDutiesModel.getVehicleName());
        holder.vehicleAllocation.setText(driverDutiesModel.getVehicleAllocation());

    }

    @Override
    public int getItemCount() {
        return driverDutiesModels.size();
    }


    public class DriverDutiesViewHolder extends RecyclerView.ViewHolder {

        TextView tourid, tourdate, destination, agentName, leadPax, pickuptime, droptime, mode, driver, vehicleName, vehicleAllocation;

        public DriverDutiesViewHolder(@NonNull View itemView) {
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
