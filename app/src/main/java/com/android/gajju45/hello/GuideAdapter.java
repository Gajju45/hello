package com.android.gajju45.hello;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.GuideViewHolder> {
    private Context mCtx;
    private List<GuideModel> guideModels;

    public GuideAdapter(Context mCtx, List<GuideModel> guideModels) {
        this.mCtx = mCtx;
        this.guideModels = guideModels;
    }

    @NonNull
    @Override
    public GuideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.guide, null);
        return new GuideViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GuideViewHolder holder, int position) {
        GuideModel guide=guideModels.get(position);
        holder.tourid.setText(guide.getTourid());
        holder.tourdate.setText(guide.getTourdate());
        holder.agentName.setText(guide.getAgeName());
        holder.destination.setText(guide.getDestination());
        holder.leadPax.setText(guide.getLeadPax());
        holder.pickuptime.setText(guide.getPickuptime());
        holder.droptime.setText(guide.getDroptime());
        holder.mode.setText(guide.getMode());
        holder.driver.setText(guide.getDriver());
        holder.vehicleName.setText(guide.getVehicleName());
        holder.vehicleAllocation.setText(guide.getVehicleAllocation());

    }

    @Override
    public int getItemCount() {
        return guideModels.size();
    }

    public class GuideViewHolder extends RecyclerView.ViewHolder {
        TextView tourid, tourdate, destination, agentName, leadPax, pickuptime, droptime, mode, driver, vehicleName, vehicleAllocation;

        public GuideViewHolder(@NonNull View itemView) {
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
