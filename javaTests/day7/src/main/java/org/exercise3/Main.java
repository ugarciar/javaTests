package org.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        boolean valid = false;
        if(values.length == 2){
            valid = ValidateMainCode.validateTeam(values[0], values[1]);
        }
        if(valid){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
