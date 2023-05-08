package org.exercise5;

class Venue {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String printDetails(){
        return "Venue Details : \n" +
                "Venue Name: "+this.name+" \n" +
                "City Name: "+this.city;
    }
}