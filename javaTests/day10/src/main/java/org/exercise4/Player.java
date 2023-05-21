package org.exercise4;

public class Player {

    private String name;
    private String skill;
    private String team;

    public Player(String name, String team, String skill) {
        this.name = name;
        this.skill = skill;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
