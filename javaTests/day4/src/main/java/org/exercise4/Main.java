package org.exercise4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("Area Calculator --- Choose your shape");
        int decission = scanner.nextInt();

        if(decission == 1){
            System.out.println("Enter lenght and breath");
            Integer lenght = scanner.nextInt();
            Integer breadth = scanner.nextInt();
            Rectangle rectangle = new Rectangle("Rectangle", lenght, breadth);
            System.out.printf("Area of the Rectangle is: %.2f", rectangle.calculateArea());
        } else if (decission == 2) {
            System.out.println("Enter side");
            Integer side = scanner.nextInt();
            Square square = new Square("Square", side);
            System.out.printf("Area of the Square is: %.2f", square.calculateArea());
        } else if (decission == 3) {
            System.out.println("Enter Radius");
            Integer radius = scanner.nextInt();
            Circle circle = new Circle("Square", radius);
            System.out.printf("Area of the Circle is: %.2f", circle.calculateArea());
        } else {
            System.out.println("Wrong decission");
        }
    }
}