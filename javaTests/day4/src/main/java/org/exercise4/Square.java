package org.exercise4;

public class Square extends Shape{
    private Integer side;

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    public Square(String shapeName, Integer side) {
        super(shapeName);
        this.side = side;
    }

    public Double calculateArea(){
        return (double) (side * side);
    }
}
