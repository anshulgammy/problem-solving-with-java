package com.utopian.nerd.problem.solving;


import java.util.Scanner;

/**
 * Problem 10: Write a Java program to find the Lowest Common Multiple(LCM) of two numbers.
 */
public class Problem_10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int firstNumber = sc.nextInt();

    System.out.println("Enter the second number:");
    int secondNumber = sc.nextInt();

    System.out.println("LCM is: " + calculateLCM(firstNumber, secondNumber));
  }

  private static int calculateLCM(int firstNumber, int secondNumber) {
    int lcm = (firstNumber * secondNumber) / calculateGCD(firstNumber, secondNumber);
    return lcm;
  }

  private static int calculateGCD(int firstNumber, int secondNumber) {
    if(firstNumber == 0) {
      return secondNumber;
    }
    return calculateGCD(secondNumber % firstNumber, firstNumber);
  }


}