package org.exercise;

public class Player implements Comparable<Player>{

    private String playerName;
    private String skill;
    private Long capNumber;

    public Player(String playerName, String skill, Long capNumber) {
        this.playerName = playerName;
        this.skill = skill;
        this.capNumber = capNumber;
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

    public Long getCapNumber() {
        return capNumber;
    }

    public void setCapNumber(Long capNumber) {
        this.capNumber = capNumber;
    }

    @Override
    public int compareTo(Player player) {
        return player.capNumber.compareTo(this.capNumber);
    }
}
