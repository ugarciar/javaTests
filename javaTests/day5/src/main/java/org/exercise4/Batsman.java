package org.exercise4;

public class Batsman extends CricketPlayer implements IPlayerStatistics{
    private Integer runs;

    public Batsman(String name, String teamName, Integer noOfMatches, Integer runs) {
        super(name, teamName, noOfMatches);
        this.runs = runs;
    }

    @Override
    public void displayPlayerStatistics() {
        System.out.println("Player name: "+ super.getName());
        System.out.println("Team name: "+ super.getTeamName());
        System.out.println("No of matches: "+super.getNoOfMatches());
        System.out.println("Runs scored: "+runs);
    }
}