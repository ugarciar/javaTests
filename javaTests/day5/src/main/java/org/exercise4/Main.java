package org.exercise4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Bowler");
        System.out.println("2.Batsman");
        System.out.println("3.WicketKeeper");
        System.out.println("4.AllRounder");
        Integer decission = scanner.nextInt();
        String continueAsking = "YES";
        while (continueAsking.equals("YES")){
            if (decission == 1) {
                System.out.println("Enter the Bowler details");
                System.out.println("Enter the player name");
                String name = scanner.nextLine();
                System.out.println("Enter team name");
                String teamName = scanner.nextLine();
                System.out.println("Enter number of matches played");
                Integer noOfMatchesPlayed = scanner.nextInt();
                System.out.println("Enter number of wickets taken");
                Integer noOfWicketsTaken = scanner.nextInt();
                Bowler bw = new Bowler(name, teamName, noOfMatchesPlayed, noOfWicketsTaken);
                bw.displayPlayerStatistics();
            } else if (decission == 2) {
                System.out.println("Enter the Batsman details");
                System.out.println("Enter the player name");
                String name = scanner.nextLine();
                System.out.println("Enter team name");
                String teamName = scanner.nextLine();
                System.out.println("Enter number of matches played");
                Integer noOfMatchesPlayed = scanner.nextInt();
                System.out.println("Enter the runs scored");
                Integer runs = scanner.nextInt();
                Batsman b = new Batsman(name, teamName, noOfMatchesPlayed, runs);
                b.displayPlayerStatistics();
            } else if (decission == 3) {
                System.out.println("Enter the WicketKeeper details");
                System.out.println("Enter the player name");
                String name = scanner.nextLine();
                System.out.println("Enter team name");
                String teamName = scanner.nextLine();
                System.out.println("Enter number of matches played");
                Integer noOfMatchesPlayed = scanner.nextInt();
                System.out.println("Enter number of catches taken");
                Integer noOfCatchesTaken = scanner.nextInt();
                System.out.println("Enter number of stumpings");
                Integer noOfStumpings = scanner.nextInt();
                System.out.println("Enter number of dismissals");
                Integer noOfDismissals = scanner.nextInt();
                System.out.println("Enter the runs scored");
                Integer runs = scanner.nextInt();
                WicketKeeper wk = new WicketKeeper(name, teamName, noOfMatchesPlayed, noOfCatchesTaken, noOfStumpings, runs, noOfDismissals);
                wk.displayPlayerStatistics();
            } else if (decission == 4) {
                System.out.println("Enter the AllRounder details");
                System.out.println("Enter the player name");
                String name = scanner.nextLine();
                System.out.println("Enter team name");
                String teamName = scanner.nextLine();
                System.out.println("Enter number of matches played");
                Integer noOfMatchesPlayed = scanner.nextInt();
                System.out.println("Enter the runs scored");
                Integer runs = scanner.nextInt();
                System.out.println("Enter number of wickets taken");
                Integer noOfWicketsTaken = scanner.nextInt();
                AllRounder aR = new AllRounder(name, teamName, noOfMatchesPlayed, runs, noOfWicketsTaken);
                aR.displayPlayerStatistics();
            } else {
                System.out.println("Wrong decission");
            }
            System.out.println("Do you want to continue?");
            continueAsking = scanner.nextLine();
        }
    }
}