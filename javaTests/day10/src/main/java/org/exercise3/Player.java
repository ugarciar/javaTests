package org.exercise3;

public class Player{

    private String playerName;
    private String skill;
    private String team;

    public Player(String playerName, String team, String skill) {
        this.playerName = playerName;
        this.skill = skill;
        this.team = team;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
