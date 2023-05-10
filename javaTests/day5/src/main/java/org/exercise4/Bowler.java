package org.exercise4;

public class Bowler extends CricketPlayer implements IPlayerStatistics{
    private Integer noOfWicketsTaken;

    public Bowler(String name, String teamName, Integer noOfMatches, Integer noOfWicketsTaken) {
        super(name, teamName, noOfMatches);
        this.noOfWicketsTaken = noOfWicketsTaken;
    }

    @Override
    public void displayPlayerStatistics() {
        System.out.println("Player name: "+ super.getName());
        System.out.println("Team name: "+ super.getTeamName());
        System.out.println("No of matches: "+super.getNoOfMatches());
        System.out.println("No of wickets taken: "+noOfWicketsTaken);
    }
}