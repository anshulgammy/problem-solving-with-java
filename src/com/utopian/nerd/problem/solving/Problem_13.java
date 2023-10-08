package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Program 13: Write a Java program to reverse a String.
 */
public class Problem_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the string:");
        String inputString = sc.next();
        System.out.println(reverseString(inputString));
    }

    private static String reverseString(String inputString) {

        if (null == inputString || inputString.trim().length() == 0) {
            return inputString;
        }

        StringBuilder reversedString = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }

        return reversedString.toString();
    }
}
