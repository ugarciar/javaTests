package org.exercise3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the player country: ");
        String country = scanner.nextLine();
        System.out.println("Enter Cap number: ");
        String capNumber = scanner.nextLine();
        System.out.println("Enter the number of test appearance: ");
        Long noOfTestAppearance = scanner.nextLong();
        System.out.println("Enter the number of ODI appearance: ");
        Long noOfODIAppearance = scanner.nextLong();
        InternationalPlayer iPlayer = new InternationalPlayer(name, country, capNumber, noOfTestAppearance, noOfODIAppearance);
        iPlayer.displayDetails();
    }
}