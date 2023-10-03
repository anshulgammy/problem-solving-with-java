package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Problem 9: Write a Java program to find the Greatest Common Divisor(GCD) of two numbers.
 */
public class Problem_9 {

  public static void main(String[] args) {

    System.out.println("Enter the first number:");
    Scanner sc = new Scanner(System.in);

    int firstNumber = sc.nextInt();

    System.out.println("Enter the second number:");

    int secondNumber = sc.nextInt();

    System.out.println("GCD is: " + calculateGCD(firstNumber, secondNumber));
    System.out.println("GCD is: " + calculateGCDBetterWay(firstNumber, secondNumber));
  }

  // Also known as Euclidean algorithm by subtraction.
  // This algo says that GCD of two numbers = GCD of difference of the two and the smaller number.
  private static int calculateGCD(int firstNumber, int secondNumber) {

    if (firstNumber == 0) {
      return secondNumber;

    } else if (secondNumber == 0) {
      return firstNumber;

    } else if (firstNumber == secondNumber) {
      return firstNumber;
    }

    if (firstNumber > secondNumber) {
      return calculateGCD(firstNumber - secondNumber, secondNumber);

    } else {
      return calculateGCD(secondNumber - firstNumber, firstNumber);
    }
  }

  // Keep dividing the bigger number by smaller number, until the remainder is zero.
  private static int calculateGCDBetterWay(int firstNumber, int secondNumber) {
    if(firstNumber == 0) {
      return secondNumber;
    }
    return calculateGCDBetterWay(secondNumber % firstNumber, firstNumber);
  }
}