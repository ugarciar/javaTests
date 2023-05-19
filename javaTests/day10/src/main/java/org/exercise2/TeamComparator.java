package org.exercise2;

import java.util.Comparator;

public class TeamComparator implements Comparator<Team> {

    @Override
    public int compare(Team team1, Team team2) {
        return team1.getNoOfMatches().compareTo(team2.getNoOfMatches());
    }
}
