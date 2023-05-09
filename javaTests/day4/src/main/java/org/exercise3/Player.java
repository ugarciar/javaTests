package org.exercise3;

class Player {
    protected String name;
    protected String country;

    public Player(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void displayDetails(){
        System.out.println("Player Details: ");
        System.out.println("Player name: " + this.name);
        System.out.println("Country: " + this.country);
    }
}