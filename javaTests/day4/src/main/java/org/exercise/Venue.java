package org.exercise;

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
    public Venue(String name, String city) {
        this.name = name;
        this.city = city;
    }
    @Override
    public String toString() {
        return name + ", " + city;
    }
}
