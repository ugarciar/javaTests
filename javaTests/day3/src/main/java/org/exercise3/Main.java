package org.exercise3;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the over: ");
        delivery.over = scanner.nextLong();
        System.out.println("Enter the ball: ");
        delivery.ball = scanner.nextLong();
        System.out.println("Enter the runs: ");
        delivery.runs = scanner.nextLong();
        System.out.println("Enter the batsman name: ");
        delivery.batsman = scanner.nextLine();
        System.out.println("Enter the bowler name: ");
        delivery.bowler = scanner.nextLine();
        System.out.println("Enter the nonStriker name: ");
        delivery.nonStriker = scanner.nextLine();
        delivery.displayDeliveryDetails();
    }
}
