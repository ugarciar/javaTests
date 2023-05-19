package org.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of players");
        int noOfPlayers = Integer.parseInt(scanner.nextLine());
        List<Player> players = new ArrayList<>();
        for(int index=0; index<noOfPlayers; index++){
            System.out.println("Enter player " + (index+1)+ " detail");
            System.out.println("Enter Name");
            String name = scanner.nextLine();
            System.out.println("Enter Skill");
            String skill = scanner.nextLine();
            System.out.println("Enter Cap Number");
            long capNumber = Long.parseLong(scanner.nextLine());
            Player pl = new Player(name, skill, capNumber);
            players.add(pl);
        }
        Collections.sort(players);
        System.out.println("Player list after sorting by cap number in descending order");
        for(Player p : players){
            System.out.println(p.getPlayerName() + "-" + p.getCapNumber());
        }

    }}