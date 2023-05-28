package org.exercise2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static void displayDateTime(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDate =LocalDateTime.parse(date, formatter);
        DateTimeFormatter formatterReturn = DateTimeFormatter.ofPattern("MM/dd/yyyy, HH:mm:ss");
        System.out.println(formatterReturn.format(localDate));
        }
}
