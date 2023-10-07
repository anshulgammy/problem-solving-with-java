package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Problem 12: Write a Java program to calculate the square root of a number without using the Math.sqrt() function.
 */
public class Problem_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        int number = sc.nextInt();

        System.out.println(calculateSquareRoot(Math.abs(number)));
    }

    /**
     * Calculate the square root using binary search.
     *
     * @param number
     * @return
     */
    private static int calculateSquareRoot(int number) {

        if (number < 2) {
            return number;
        }

        int low = 2;
        int high = number;
        int mid = high;

        while (low <= high) {

            mid = (low + high) / 2;
            int product = mid * mid;

            if (product == number) {
                return mid;
            } else if (product < number) {
                low = ++mid;
            } else if (product > number) {
                high = --mid;
            }
        }

        return mid;
    }
}
