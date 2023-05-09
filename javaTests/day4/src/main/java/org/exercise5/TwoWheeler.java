package org.exercise5;

public class TwoWheeler extends Vehicle{
    private Boolean kickStartAvailable;

    public Boolean getKickStartAvailable() {
        return kickStartAvailable;
    }

    public void setKickStartAvailable(Boolean kickStartAvailable) {
        this.kickStartAvailable = kickStartAvailable;
    }

    public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc, Boolean kickStartAvailable) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.kickStartAvailable = kickStartAvailable;
    }

    @Override
    public void displayDetailInfo() {
        System.out.println("Kick Start Available: " + (kickStartAvailable?"YES":"NO"));
    }
}

