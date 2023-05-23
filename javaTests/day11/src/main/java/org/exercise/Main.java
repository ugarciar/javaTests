package org.exercise;

import java.util.Scanner;

@FunctionalInterface
interface MyFunctionalInterface {
    int multiplyNumbers(int x, int y);

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Number 2");
        int number2 = Integer.parseInt(scanner.nextLine());
        MyFunctionalInterface msg = (x, y) -> x*y;
        System.out.println(msg.multiplyNumbers(number1,number2));
    }
}