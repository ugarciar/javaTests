package org.exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class UserMainCode {

    public static void displayDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate localDate =LocalDate.parse(date, formatter);
        DateTimeFormatter formatterReturn = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatterReturn.format(localDate));
        }
}
