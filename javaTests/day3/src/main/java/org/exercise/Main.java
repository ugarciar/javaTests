package org.exercise;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Venue venue = new Venue();
        System.out.println("Enter the venue name: ");
        Scanner scanner = new Scanner(System.in);
        venue.name = scanner.nextLine();
        System.out.println("Enter the city name: ");
        venue.city = scanner.nextLine();
        System.out.println(venue.printDetails());

    }

}