package org.exercise2;

public class Team {

    private String name;
    private Long noOfMatches;

    public Team(String name, Long noOfMatches) {
        this.name = name;
        this.noOfMatches = noOfMatches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(Long noOfMatches) {
        this.noOfMatches = noOfMatches;
    }
}
