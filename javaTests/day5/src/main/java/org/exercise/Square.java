package org.exercise;

public class Square extends Shape{
    private Integer side;

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    public Square(String name, Integer side) {
        super(name);
        this.side = side;
    }

    @Override
    public Float calculateArea(){
        return (float) (side * side);
    }
}