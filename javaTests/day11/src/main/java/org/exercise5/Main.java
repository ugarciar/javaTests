package org.exercise5;

import java.util.Scanner;

@FunctionalInterface
interface MyFunctionalInterface {
    int factorial(int number);

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = Integer.parseInt(scanner.nextLine());
        MyFunctionalInterface msg = (num) -> {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            return fact;
            };
        System.out.println(msg.factorial(number));
    }
}