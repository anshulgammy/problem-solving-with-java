package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Problem 1: Write a Java program to print first ‘n’ Fibonacci Numbers.
 */
public class Problem_1 {

  public static void main(String[] args) {

    System.out.println("Enter the value for n:");
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int firstNumber = 0;
    int secondNumber = 1;
    int currentNumber;

    for (int i = 0; i < n; i++) {
      System.out.print(firstNumber + " ");
      currentNumber = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = currentNumber;
    }
  }
}
