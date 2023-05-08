package org.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the team details");
        String[] values = scanner.nextLine().split("#");
        if(values.length == 5){
            Team team = new Team(values[0],values[1],values[2],values[3],values[4]);
            System.out.println("Team: " + team.getName());
            System.out.println("Coach: " + team.getCoach());
            System.out.println("Location: " + team.getLocation());
            System.out.println("Players: " + team.getPlayers());
            System.out.println("Captain: " + team.getCaptain());
        }
    }
}