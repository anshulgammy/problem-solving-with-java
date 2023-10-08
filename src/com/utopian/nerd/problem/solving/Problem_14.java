package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Program 14: Write a Java program to determine if the provided year is a leap year or not.
 */
public class Problem_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int inputYear = sc.nextInt();
        System.out.println("Leap Year: " + isLeapYear(inputYear));
    }

    /**
     * Year is leap year if:
     * 1) It is multiple of 400, or
     * 2) It is multiple of 4 but not a multiple of 100.
     *
     * @param inputYear - int input year
     * @return boolean status of whether the year is leap year or not.
     */
    private static boolean isLeapYear(int inputYear) {

        if ((inputYear % 400 == 0) || (inputYear % 4 == 0 && inputYear % 100 != 0)) {
            return true;
        }
        return false;
    }
}
