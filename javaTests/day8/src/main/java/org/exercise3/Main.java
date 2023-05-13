package org.exercise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the expected winner team of IPL Season 4");
            String team1 = scanner.nextLine();
            Team winner = new Team(team1);
            System.out.println("Enter the expected runner team of IPL Season 4");
            String team2 = scanner.nextLine();
            Team runner = new Team(team2);
            System.out.println("Expected IPL Season 4 winner: " + winner.getName());
            System.out.println("Expected IPL Season 4 runner: " + runner.getName());
        } catch (TeamNotFoundException ex){
            System.out.println("TeamNotFoundException: " + ex.getMessage());
        }
    }
}
