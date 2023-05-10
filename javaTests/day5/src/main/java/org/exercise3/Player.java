package org.exercise3;

class Player implements IPlayerStatistics{
    private String name;
    private String teamName;
    private Integer noOfMatches;
    private Long totalRunsScored;
    private Integer noOfWicketsTaken;

    public Player(String name, String teamName, Integer noOfMatches, Long totalRunsScored, Integer noOfWicketsTaken) {
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
        this.totalRunsScored = totalRunsScored;
        this.noOfWicketsTaken = noOfWicketsTaken;
    }

    @Override
    public void displayPlayerStatistics() {
        System.out.println("Player Details");
        System.out.println("Player name: "+name);
        System.out.println("Team name: "+teamName);
        System.out.println("No of matches: "+noOfMatches);
        System.out.println("Total runs scored: "+totalRunsScored);
        System.out.println("No of wickets taken: "+noOfWicketsTaken);
    }
}