package com.johnsmith.javacore.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1507 {
    public static void main(String[] args) {
        Leetcode1507 leetcode1507 = new Leetcode1507();
        System.out.println(leetcode1507.reformatDate("20th Oct 2052"));
    }

    public String reformatDate(String date) {
        String[] splitStrings = date.split(" ");
        String day = splitStrings[0].substring(0, splitStrings[0].length() - 2);
        String month = splitStrings[1];
        String year = splitStrings[2];

        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");

        String formattedDay = day.length() == 2 ? day : "0" + day;
        String formattedMonth = monthMap.get(month);
        String formattedYear = year;

        return formattedYear + "-" + formattedMonth + "-" + formattedDay;
    }
}
