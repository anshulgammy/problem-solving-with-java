package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Problem 6: Write a Java program to calculate factorial of a given number.
 */
public class Problem_6 {

  public static void main(String[] args) {

    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    if(number < 0) {
      System.out.println("Factorial cannot be calculated for a negative number");
      System.exit(0);
    }

    System.out.println(String.format("Factorial is %s", calculateFactorialIterative(number)));
    System.out.println(String.format("Factorial is %s", calculateFactorialRecursive(number)));
    System.out.println(String.format("Factorial is %s", calculateFactorialTernary(number)));
  }

  private static int calculateFactorialTernary(int number) {
    return number == 0 ? 1 : number * calculateFactorialTernary(--number);
  }

  private static int calculateFactorialRecursive(int number) {

    if(number == 0) {
      return 1;
    }

    return number * calculateFactorialRecursive(--number);
  }

  private static int calculateFactorialIterative(int number) {
    int factorial = 1;

    for (int i = 2; i <= number; i++) {
      factorial = factorial * i;
    }

    return factorial;
  }
}
