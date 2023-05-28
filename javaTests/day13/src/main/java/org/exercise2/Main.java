package org.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter String in this format(yyyy-MM-DD HH:mm:ss)");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        UserMainCode.displayDateTime(date);
    }
}