package org.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int noOfTeams = Integer.parseInt(scanner.nextLine());
        List<Team> teams = new ArrayList<>();
        for(int index=0; index<noOfTeams; index++){
            System.out.println("Enter team " + (index+1)+ " detail");
            System.out.println("Enter Name");
            String name = scanner.nextLine();
            System.out.println("Enter number of matches");
            long noOfMatches = Long.parseLong(scanner.nextLine());
            Team team = new Team(name, noOfMatches);
            teams.add(team);
        }
        teams.sort(new TeamComparator());
        System.out.println("Team list after sort by number of matches");
        for(Team t : teams){
            System.out.println(t.getNoOfMatches());
        }

    }}