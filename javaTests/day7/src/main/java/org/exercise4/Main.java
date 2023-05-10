package org.exercise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] player1 = scanner.nextLine().split(" ");
        String[] player2 = scanner.nextLine().split(" ");
        if(player1.length == 2 && player2.length==2){
            UserMainCode.compareLastNames(player1[1], player2[1]);
        }
    }
}
