package org.exercise3;

import java.util.Arrays;
import java.util.List;

public class Team {

    public static final List<String> IPL_TEAMS = Arrays.asList(
            "Chennai Super Kings",
            "Deccan Chargers",
            "Delhi Daredevils",
            "Kings XI Punjab",
            "Kolkata Knight Riders",
            "Mumbai Indians",
            "Royal Challengers Bangalore"
    );

    private String name;

    public Team(String name) throws TeamNotFoundException {
        validateTeam(name);
        this.name = name;
    }

    private void validateTeam(String name) throws TeamNotFoundException {
        if(!IPL_TEAMS.contains(name)){
            throw new TeamNotFoundException("Entered team is not part of the IPL Season 4");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
