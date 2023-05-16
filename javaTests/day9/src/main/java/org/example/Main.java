package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noMatches = Integer.parseInt(scanner.nextLine());
        int[] runs = new int[noMatches];
        for(int index=0;index<noMatches;index++){
            runs[index] =Integer.parseInt(scanner.nextLine());
        }
        int total = 0;
        for (int i = 0; i < runs.length; i++) {
            total += runs[i];
        }
        System.out.println();
        System.out.println(total);
        float average = (float) total / noMatches;
        System.out.println(average);
    }
}