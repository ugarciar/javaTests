package org.exercise4;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("Enter the player details: ");
        Scanner scanner = new Scanner(System.in);
        String[] details = scanner.nextLine().split(",");
        player.name = details[0];
        player.country = details[1];
        player.skill = details[2];
        System.out.println(player.printDetails());
    }
}