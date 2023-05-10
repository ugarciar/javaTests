package org.exercise4;

public class WicketKeeper extends CricketPlayer implements IPlayerStatistics{
    private Integer noOfCatches;
    private Integer noOfStumpings;
    private Integer runs;
    private Integer noOfDismissals;

    public WicketKeeper(String name, String teamName, Integer noOfMatches, Integer noOfCatches, Integer noOfStumpings, Integer runs, Integer noOfDismissals) {
        super(name, teamName, noOfMatches);
        this.noOfCatches = noOfCatches;
        this.noOfStumpings = noOfStumpings;
        this.runs = runs;
        this.noOfDismissals = noOfDismissals;
    }


    @Override
    public void displayPlayerStatistics() {
        System.out.println("Player name: "+ super.getName());
        System.out.println("Team name: "+ super.getTeamName());
        System.out.println("No of matches: "+super.getNoOfMatches());
        System.out.println("No of catches taken: "+noOfCatches);
        System.out.println("No of stumpings: "+noOfStumpings);
        System.out.println("No of dismissals: "+noOfDismissals);
        System.out.println("Runs scored: "+runs);
    }
}
