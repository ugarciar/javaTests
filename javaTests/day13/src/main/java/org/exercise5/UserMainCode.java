package org.exercise5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UserMainCode {

    public static void getMothDifference(LocalDate date1, LocalDate date2) {
        System.out.println(ChronoUnit.MONTHS.between(date1, date2));
    }
}
