package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Problem 5: Write a Java program to check if a given Integer is Armstrong number or not.
 */
public class Problem_5 {

  public static void main(String[] args) {

    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);

    int targetNumber = sc.nextInt();
    int order = String.valueOf(targetNumber).length();

    int number = targetNumber;
    int result = 0;

    while (number > 0) {
      result = (int) (result + Math.pow(number % 10, order));
      number = number / 10;
    }

    if (targetNumber == result) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Not Armstrong Number");
    }
  }
}
