package com.utopian.nerd.problem.solving;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem 7: Write a Java Program to Remove Duplicate Elements From the Array.
 */
public class Problem_7 {

  public static void main(String[] args) {

    System.out.println("Enter the elements, separated by comma:");
    Scanner sc = new Scanner(System.in);

    String commaSeparatedString = sc.nextLine();

    usingString(commaSeparatedString);
    usingFrequencyArray(commaSeparatedString);
    usingSorting(commaSeparatedString);
    // using HashSet
  }

  private static void usingSorting(String commaSeparatedString) {
    String[] originalNumberStringArray = commaSeparatedString.split(",");
    Arrays.sort(originalNumberStringArray);

    int[] originalNumberArray = new int[originalNumberStringArray.length];

    for (int i = 0; i < originalNumberStringArray.length; i++) {
      originalNumberArray[i] = Integer.parseInt(originalNumberStringArray[i]);
    }

    int prevNumber = -1;

    for (int i = 0; i < originalNumberArray.length; i++) {
      if (prevNumber != originalNumberArray[i]) {
        System.out.print(originalNumberArray[i] + " ");
        prevNumber = originalNumberArray[i];
      }
    }
  }

  private static void usingFrequencyArray(String commaSeparatedString) {
    String[] originalNumberStringArray = commaSeparatedString.split(",");
    int[] originalNumberArray = new int[originalNumberStringArray.length];

    for (int i = 0; i < originalNumberStringArray.length; i++) {
      originalNumberArray[i] = Integer.parseInt(originalNumberStringArray[i]);
    }

    int largestNumber = 0;

    for (int i = 0; i < originalNumberArray.length; i++) {
      if (originalNumberArray[i] > largestNumber) {
        largestNumber = originalNumberArray[i];
      }
    }

    int[] frequencyArray = new int[largestNumber + 1];

    for (int i = 0; i < originalNumberArray.length; i++) {
      frequencyArray[originalNumberArray[i]]++;
    }

    for (int i = 0; i < frequencyArray.length; i++) {
      if (frequencyArray[i] > 0) {
        System.out.print(i + " ");
      }
    }

    System.out.println();
  }

  private static void usingString(String commaSeparatedString) {
    String[] originalNumberArray = commaSeparatedString.split(",");

    String uniqueNumberArrayString = "";

    for (int i = 0; i < originalNumberArray.length; i++) {
      if (!uniqueNumberArrayString.contains(originalNumberArray[i])) {
        if (i != 0) {
          uniqueNumberArrayString += ",";
          uniqueNumberArrayString += originalNumberArray[i];
        } else {
          uniqueNumberArrayString += originalNumberArray[i];
        }
      }
    }

    System.out.println("Unique numbers are: " + uniqueNumberArrayString);
  }
}