package org.exercise5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        String date2 = scanner.nextLine();
        LocalDate localDate2 = LocalDate.parse(date2, formatter);
        UserMainCode.getMothDifference(localDate, localDate2);
    }
}