package org.exercise4;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int noOfPlayers = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Player> players = new TreeMap<>();
        for(int index=0; index<noOfPlayers; index++){
            System.out.println("Enter the details of the player " + (index+1));
            String capNumber = scanner.nextLine();
            String name = scanner.nextLine();
            String team = scanner.nextLine();
            String skill = scanner.nextLine();
            Player pl = new Player(name, team, skill);
            players.put(capNumber, pl);
        }
        System.out.println("Player Details");
        for (Map.Entry<String, Player> entry : players.entrySet()) {
            printPlayerDetails(entry.getKey(), entry.getValue());
        }

        System.out.println("Enter the cap number of the player to be searched");
        String capNumberToSearch = scanner.nextLine();
        Player playerSearched = players.get(capNumberToSearch);
        if(playerSearched == null){
            System.out.println("Player not found");
        }else{
            printPlayerDetails(capNumberToSearch, playerSearched);
        }
    }

    private static void printPlayerDetails(String capNumber, Player player){
        System.out.println(capNumber + "--" +
                player.getName() + "--" +
                player.getTeam() + "--" +
                player.getSkill());
    }

}