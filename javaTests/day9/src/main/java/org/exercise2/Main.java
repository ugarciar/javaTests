package org.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the team name");
        String name = scanner.nextLine();
        System.out.println("Enter the number of matches played in home ground");
        int noOfMatches = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the runs scored");
        List<Integer> runs = new ArrayList<>();
        for(int index=0; index<noOfMatches; index++){
            int run = Integer.parseInt(scanner.nextLine());
            runs.add(run);
        }
        System.out.println("Enter the number of matches played in other ground");
        int noOfMatchesOtherGround = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the runs scored");
        for(int index=0; index<noOfMatchesOtherGround; index++){
            int run = Integer.parseInt(scanner.nextLine());
            runs.add(run);
        }
        Team team = new Team(name, runs);
        team.printRuns();
        team.printRunsMoreThanValue(300);
    }
}