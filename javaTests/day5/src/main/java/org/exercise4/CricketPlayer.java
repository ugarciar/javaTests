package org.exercise4;

public class CricketPlayer {
    private String name;
    private String teamName;
    private Integer noOfMatches;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(Integer noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public CricketPlayer(String name, String teamName, Integer noOfMatches) {
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
    }
}
