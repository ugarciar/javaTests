package org.exercise2;

class Player {
    String name;
    String country;
    String skill;

    public String printDetails(){
        return "Player Details : \n" +
                "Player Name: "+this.name+" \n" +
                "Country Name: "+this.country+" \n" +
                "Skill: " + this.skill;
    }
}