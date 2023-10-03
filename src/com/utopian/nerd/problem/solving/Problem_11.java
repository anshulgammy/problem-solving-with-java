package com.utopian.nerd.problem.solving;


import java.util.Scanner;

/**
 * Problem 11: Write a Java program to list all the prime factors of a number.
 */
public class Problem_11 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number:");
    int number = sc.nextInt();

    System.out.println("Prime factors are:");
    findPrimeFactors(number);
  }

  private static void findPrimeFactors(int number) {

    // also we can use i <= Math.sqrt(number);
    for (int i = 2; i <= number / 2; i++) {
      while (number % i == 0) {
        number = number / i;
        System.out.print(i + " ");
      }
    }

    if (number > 1) {
      System.out.print(number);
    }
  }
}