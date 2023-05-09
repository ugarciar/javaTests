package org.exercise2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of wickets");
        int noWickets = scanner.nextInt();
        Wicket[] wickets = new Wicket[noWickets];
        for(int index = 0; index<noWickets; index++){
            System.out.println("Enter details of wicket " + (index+1));
            String[] values = scanner.nextLine().split(",");
            if(values.length == 5){
                Wicket wicket = new Wicket(Long.valueOf(values[0]),Long.valueOf(values[1]),values[2],values[3],values[4]);
                wickets[index] = wicket;
            }
        }
        System.out.println("Wicket Details");
        for(Wicket wk : wickets){
            wk.printDetails();
        }
    }
}