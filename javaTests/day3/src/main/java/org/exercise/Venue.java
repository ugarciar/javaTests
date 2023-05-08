package org.exercise;

class Venue {
    String name;
    String city;

    public String printDetails(){
        return "Venue Details : \n" +
                "Venue Name: "+this.name+" \n" +
                "City Name: "+this.city;
    }
}