package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Problem 2: Write a Java program to check if a given number is prime or not
 */
public class Problem_2 {

  public static void main(String[] args) {

    System.out.println("Enter the value for n:");
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if (n <= 1) {
      System.out.println("Not Prime");
      System.exit(0);
    }

    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        System.out.println("Not Prime");
        System.exit(0);
      }
    }

    System.out.println("Prime");
  }
}
