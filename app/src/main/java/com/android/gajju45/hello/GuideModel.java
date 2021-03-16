package com.android.gajju45.hello;

public class GuideModel {

    String tourid, tourdate, destination, ageName, leadPax, pickuptime, droptime, mode, driver, vehicleName, vehicleAllocation;

    public GuideModel() {
    }

    public GuideModel(String tourid, String tourdate, String destination, String ageName, String leadPax, String pickuptime, String droptime, String mode, String driver, String vehicleName, String vehicleAllocation) {
        this.tourid = tourid;
        this.tourdate = tourdate;
        this.destination = destination;
        this.ageName = ageName;
        this.leadPax = leadPax;
        this.pickuptime = pickuptime;
        this.droptime = droptime;
        this.mode = mode;
        this.driver = driver;
        this.vehicleName = vehicleName;
        this.vehicleAllocation = vehicleAllocation;
    }

    public String getTourid() {
        return tourid;
    }

    public void setTourid(String tourid) {
        this.tourid = tourid;
    }

    public String getTourdate() {
        return tourdate;
    }

    public void setTourdate(String tourdate) {
        this.tourdate = tourdate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAgeName() {
        return ageName;
    }

    public void setAgeName(String ageName) {
        this.ageName = ageName;
    }

    public String getLeadPax() {
        return leadPax;
    }

    public void setLeadPax(String leadPax) {
        this.leadPax = leadPax;
    }

    public String getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(String pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getDroptime() {
        return droptime;
    }

    public void setDroptime(String droptime) {
        this.droptime = droptime;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleAllocation() {
        return vehicleAllocation;
    }

    public void setVehicleAllocation(String vehicleAllocation) {
        this.vehicleAllocation = vehicleAllocation;
    }
}
