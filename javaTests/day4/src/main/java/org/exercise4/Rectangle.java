package org.exercise4;

public class Rectangle extends Shape{
    private Integer length;
    private Integer breadth;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public void setBreadth(Integer breadth) {
        this.breadth = breadth;
    }

    public Rectangle(String shapeName, Integer length, Integer breadth) {
        super(shapeName);
        this.length = length;
        this.breadth = breadth;
    }
    public Double calculateArea(){
        return (double) (length * breadth);
    }
}