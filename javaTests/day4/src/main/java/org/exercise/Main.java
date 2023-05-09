package org.exercise;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter the venue name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter the city name: ");
        String city = scanner.nextLine();
        VenueBO bo = new VenueBO();
        System.out.println("Venue details: ");
        bo.displayVenueDetails(new Venue(name, city));
    }
}