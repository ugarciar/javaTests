package org.exercise3;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class UserMainCode {

    public static void displayDay(LocalDate date) {
        System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
