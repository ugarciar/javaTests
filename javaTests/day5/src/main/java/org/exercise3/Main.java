package org.exercise3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player name");
        String name = scanner.nextLine();
        System.out.println("Enter team name");
        String teamName = scanner.nextLine();
        System.out.println("Enter number of matches played");
        Integer noOfMatchesPlayed = scanner.nextInt();
        System.out.println("Enter total runs scored");
        Long totalRunsScored = scanner.nextLong();
        System.out.println("Enter number of wickets taken");
        Integer noOfWicketsTaken = scanner.nextInt();
        Player player = new Player(name, teamName, noOfMatchesPlayed, totalRunsScored, noOfWicketsTaken);
        player.displayPlayerStatistics();
    }
}