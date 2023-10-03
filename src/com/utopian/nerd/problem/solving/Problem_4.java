package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Problem 4: Write a Java program to check if a given Integer is palindrome or not.
 */
public class Problem_4 {

  public static void main(String[] args) {

    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);

    int targetNumber = sc.nextInt();
    int number = targetNumber;
    int reversedNumber = 0;

    while (number > 0) {
      int remainder = number % 10;
      number = number / 10;
      reversedNumber = (reversedNumber * 10) + remainder;
    }

    if (reversedNumber == targetNumber) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
