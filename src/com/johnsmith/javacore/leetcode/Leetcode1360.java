package com.johnsmith.javacore.leetcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Leetcode1360 {
    public static void main(String[] args) {
        System.out.println(Leetcode1360.daysBetweenDates("2019-06-29", "2019-06-30"));
        System.out.println(Leetcode1360.daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    public static int daysBetweenDates(String dateOne, String dateTwo) {
        String[] dateOneParts = dateOne.split("-");
        String[] dateTwoParts = dateTwo.split("-");
        LocalDate startDate = LocalDate.of(Integer.parseInt(dateOneParts[0]), Integer.parseInt(dateOneParts[1]),Integer.parseInt(dateOneParts[2]));
        LocalDate endDate = LocalDate.of(Integer.parseInt(dateTwoParts[0]), Integer.parseInt(dateTwoParts[1]),Integer.parseInt(dateTwoParts[2]));
        return (int) Math.abs(ChronoUnit.DAYS.between(startDate,endDate));
    }
}
