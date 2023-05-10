package org.exercise;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle");
        System.out.println("Square");
        System.out.println("Rectangle");
        System.out.println("Enter the Shape name");
        String decission = scanner.nextLine();

        if(decission.equals("Circle")){
            System.out.println("Enter the Radius");
            Integer radius = scanner.nextInt();
            Circle circle = new Circle("Square", radius);
            System.out.printf("Area of the Circle is %.2f", circle.calculateArea());
        } else if (decission.equals("Square")) {
            System.out.println("Enter the side");
            Integer side = scanner.nextInt();
            Square square = new Square("Square", side);
            System.out.printf("Area of the Square is %.2f", square.calculateArea());
        } else if (decission.equals("Rectangle")) {
            System.out.println("Enter the lenght");
            Integer lenght = scanner.nextInt();
            System.out.println("Enter the breath");
            Integer breadth = scanner.nextInt();
            Rectangle rectangle = new Rectangle("Rectangle", lenght, breadth);
            System.out.printf("Area of the Rectangle is %.2f", rectangle.calculateArea());
        } else {
            System.out.println("Wrong decission");
        }
    }
}