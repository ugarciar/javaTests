package org.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noMatches = Integer.parseInt(scanner.nextLine());
        List<Integer> runs = new ArrayList<>();
        for(int index=0;index<noMatches;index++){
            runs.add(Integer.parseInt(scanner.nextLine()));
        }
        int total = 0;
        for (int run : runs) {
            total += run;
        }
        System.out.println();
        System.out.println(total);
        float average = (float) total / noMatches;
        System.out.println(average);
    }
}