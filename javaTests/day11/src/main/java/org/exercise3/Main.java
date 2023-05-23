package org.exercise3;

import java.util.Scanner;

@FunctionalInterface
interface MyFunctionalInterface {
    Boolean checkUser(String username, String password);

}

public class Main {
    private static final String username = "Unai";
    private static final String password = "pwd";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username");
        String user = scanner.nextLine();
        System.out.println("Enter Password");
        String pwd = scanner.nextLine();
        MyFunctionalInterface msg = (userIn, pwdIn) -> (userIn.equals(username) && pwdIn.equals(password));
        System.out.println(msg.checkUser(user,pwd));
    }
}