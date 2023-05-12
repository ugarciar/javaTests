package org.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of overs");
        int overs = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of runs for each over");

        try {
            int[] runs = new int[overs];
            for(int index = 0; index < overs; index++){
                runs[index] = Integer.parseInt(scanner.nextLine());
            }
            System.out.println("Enter the over number");
            int overNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Runs scored in this over : " + runs[overNumber-1]);
        } catch (ArrayIndexOutOfBoundsException|NegativeArraySizeException e) {
            System.out.println(e.getClass());
        }
    }
}