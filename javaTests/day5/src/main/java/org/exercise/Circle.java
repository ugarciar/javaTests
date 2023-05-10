package org.exercise;

public class Circle extends Shape{
    private Integer radius;

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Circle(String name, Integer radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public Float calculateArea(){
        return (float) (2 * Math.PI * radius);
    }
}