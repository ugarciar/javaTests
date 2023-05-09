package org.exercise2;

class Player {
    private String name;
    private String country;
    private String skill;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public Player(String name, String country, String skill) {
        this.name = name;
        this.country = country;
        this.skill = skill;
    }
    @Override
    public String toString() {
        return name + "\t" + country + "\t" + skill;
    }
}
