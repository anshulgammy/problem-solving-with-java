package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Problem 3: Write a Java program to check if a given String is palindrome or not.
 */
public class Problem_3 {

  public static void main(String[] args) {

    System.out.println("Enter the string:");
    Scanner sc = new Scanner(System.in);

    String str = sc.next();

    if (str == null || str.trim().length() == 0) {
      System.out.println("Not Palindrome");
    }

    // naiveWay(str);

    if (betterWay(str)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }

  private static boolean betterWay(String str) {

    int midPosition = str.length() / 2;

    for (int i = 0; i < midPosition; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }

    return true;
  }

  private static void naiveWay(String str) {
    String reversedString = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reversedString = reversedString + str.charAt(i);
    }

    if (reversedString.equals(str)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
