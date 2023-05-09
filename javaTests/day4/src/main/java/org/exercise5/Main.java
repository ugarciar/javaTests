package org.exercise5;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Four Wheeler");
        System.out.println("2. Two Wheeler");
        System.out.println("Enter Vehicle Type");
        int decission = scanner.nextInt();

        System.out.println("Vehicle make:");
        String make = scanner.nextLine();
        System.out.println("Vehicle Number:");
        String vehicleNumber = scanner.nextLine();
        System.out.println("Fuel type:");
        System.out.println("1. Petrol");
        System.out.println("2. Diesel");
        Integer fuelTypeDecission = scanner.nextInt();
        String fuelType = null;
        if(fuelTypeDecission == 1){
            fuelType = "Petrol";
        } else if (fuelTypeDecission == 2) {
            fuelType = "Diesel";
        }
        System.out.println("Fuel capacity:");
        Integer fuelCapacity = scanner.nextInt();
        System.out.println("Engine CC:");
        Integer cc = scanner.nextInt();
        if(decission == 1){
            System.out.println("Audio System:");
            String audioSystem = scanner.nextLine();
            System.out.println("Number of Doors:");
            Integer numberOfDoors = scanner.nextInt();
            FourWheeler fw = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
            fw.displayMake();
            fw.displayBasicInfo();
            fw.displayDetailInfo();
        } else if (decission == 2) {
            System.out.println("Kick Start Available(yes/no):");
            String kickStartAvailableDecission = scanner.nextLine();
            Boolean kickStartAvailable = false;
            if("yes".equals(kickStartAvailableDecission)){
                kickStartAvailable = true;
            }
            TwoWheeler tw = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
            tw.displayMake();
            tw.displayBasicInfo();
            tw.displayDetailInfo();
        } else {
            System.out.println("Wrong decission");
        }
    }
}