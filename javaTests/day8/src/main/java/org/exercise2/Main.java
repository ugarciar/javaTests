package org.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player name");
        String name = scanner.nextLine();
        System.out.println("Enter the player age");
        int age = Integer.parseInt(scanner.nextLine());
        try {
            Player p = new Player(name, age);
            System.out.println("Player name : " + p.getName());
            System.out.println("Player age : " + p.getAge());
        } catch (CustomException ex){
            System.out.println("CustomException: " + ex.getMessage());
        }
    }
}