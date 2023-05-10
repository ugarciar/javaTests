package org.exercise4;

public class AllRounder extends CricketPlayer implements IPlayerStatistics{
    private Integer runs;
    private Integer noOfWickets;

    public AllRounder(String name, String teamName, Integer noOfMatches, Integer runs, Integer noOfWickets) {
        super(name, teamName, noOfMatches);
        this.runs = runs;
        this.noOfWickets = noOfWickets;
    }

    @Override
    public void displayPlayerStatistics() {
        System.out.println("Player name: "+ super.getName());
        System.out.println("Team name: "+ super.getTeamName());
        System.out.println("No of matches: "+super.getNoOfMatches());
        System.out.println("Runs scored: "+runs);
        System.out.println("No of wickets taken: "+noOfWickets);
    }
}
