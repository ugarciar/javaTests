package org.exercise4;

public class Circle extends Shape{
    private Integer radius;

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Circle(String shapeName, Integer radius) {
        super(shapeName);
        this.radius = radius;
    }
    public Double calculateArea(){
        return 2 * Math.PI * radius;
    }
}