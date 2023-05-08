package org.exercise2;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("Enter the player name: ");
        Scanner scanner = new Scanner(System.in);
        player.name = scanner.nextLine();
        System.out.println("Enter the country name: ");
        player.country = scanner.nextLine();
        System.out.println("Enter the skill: ");
        player.skill = scanner.nextLine();
        System.out.println(player.printDetails());
    }
}