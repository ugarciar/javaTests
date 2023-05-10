package org.exercise2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the Card");
        System.out.println("1. Payback Card");
        System.out.println("2. Membership Card");
        int decission = scanner.nextInt();
        System.out.println("Enter the card details");
        String details = scanner.nextLine();
        String[] split = details.split("\\|");
        String holderName = split[0];
        String cardNumber = split[1];
        String expiryDate = split[2];
        if(decission == 1){
            System.out.println("Enter points in card");
            Integer pointsInCard = scanner.nextInt();
            System.out.println("Enter the amount");
            Double amount = scanner.nextDouble();
            PaybackCard p = new PaybackCard(holderName, cardNumber, expiryDate, pointsInCard, amount);
            p.printDetails();
        } else if (decission == 2) {
            System.out.println("Enter the rating in card");
            Integer rating = scanner.nextInt();
            MembershipCard m = new MembershipCard(holderName, cardNumber, expiryDate, rating);
            m.printDetails();
        } else {
            System.out.println("Wrong decission");
        }

    }
}