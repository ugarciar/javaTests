package org.exercise2;

import java.util.Scanner;

@FunctionalInterface
interface MyFunctionalInterface {
    String concatenateStrings(String x, String y);

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1");
        String string1 = scanner.nextLine();
        System.out.println("Enter String 2");
        String string2 = scanner.nextLine();
        MyFunctionalInterface msg = (x, y) -> x + " " + y;
        System.out.println(msg.concatenateStrings(string1,string2));
    }
}