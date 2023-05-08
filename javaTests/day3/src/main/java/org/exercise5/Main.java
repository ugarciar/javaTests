package org.exercise5;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Venue venue = new Venue();
        System.out.println("Enter the venue name: ");
        Scanner scanner = new Scanner(System.in);
        venue.setName(scanner.nextLine());
        System.out.println("Enter the city name: ");
        venue.setCity(scanner.nextLine());
        System.out.println(venue.printDetails());

        System.out.println("Verify and Update Venue Details: \n" +
                "Menu: \n" +
                "1.Update Venue Name \n" +
                "2.Update City Name \n" +
                "3.All informations Correct/Exit \n" +
                "Type 1 or 2 or 3: ");
        int decision = scanner.nextInt();
        if(decision == 1) {
            System.out.println("Enter the venue name: ");
            venue.setName(scanner.nextLine());
            System.out.println(venue.printDetails());
        } else if (decision == 2) {
            System.out.println("Enter the city name: ");
            venue.setCity(scanner.nextLine());
            System.out.println(venue.printDetails());
        } else if (decision == 3) {
            System.out.println(venue.printDetails());
        }
    }
}