package org.exercise5;

public class Vehicle {
    protected String make;
    protected String vehicleNumber;
    protected String fuelType;
    protected Integer fuelCapacity;
    protected Integer cc;

    public Vehicle(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }

    public void displayMake(){
        System.out.println("***" + make + "***");
    }

    public void displayBasicInfo(){
        System.out.println("---Basic Information---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("CC: " + cc);
    }

    public void displayDetailInfo(){}
}