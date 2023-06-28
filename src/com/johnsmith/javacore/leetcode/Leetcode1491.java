package com.johnsmith.javacore.leetcode;

public class Leetcode1491 {
    public static void main(String[] args) {
        Leetcode1491 leetcode1491 = new Leetcode1491();
        System.out.println(leetcode1491.average(new int[]{4000, 3000, 1000, 2000}));
    }

    public double average(int[] salaries) {
        int min = salaries[0], max = salaries[0], sum = salaries[0];

        for (int i = 1; i < salaries.length; i++) {
            if (min > salaries[i]) min = salaries[i];
            if (max < salaries[i]) max = salaries[i];
            sum += salaries[i];
        }

        return ((sum - min - max) * 1.0) / (salaries.length - 2);
    }
}
