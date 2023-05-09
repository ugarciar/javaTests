package org.exercise2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int playerNumber = scanner.nextInt();
        Player[] players = new Player[playerNumber];
        for(int index = 0; index< playerNumber; index++){
            System.out.println("Enter the player name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the country name: ");
            String country = scanner.nextLine();
            System.out.println("Enter the skill: ");
            String skill = scanner.nextLine();
            players[index] = new Player(name, country, skill);
        }
        System.out.println("Player details: ");
        PlayerBO bo = new PlayerBO();
        bo.displayAllPlayerDetails(players);
    }
}