package com.utopian.nerd.problem.solving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem 8: Write a Java program to find repeated characters in a String. For example, if given
 * input to your program is "Java", it should print all duplicates characters along with their
 * count. eg: Java should output repeated character and its count a = 2.
 */
public class Problem_8 {

  public static void main(String[] args) {

    System.out.println("Enter the string:");
    Scanner sc = new Scanner(System.in);

    String inputString = sc.next();

    calculateRepeatedCharactersUsingHashMap(inputString);
  }

  private static void calculateRepeatedCharactersUsingHashMap(String inputString) {

    Map<Character, Integer> characterCountMap = new HashMap<>();

    for (int i = 0; i < inputString.length(); i++) {
      if (characterCountMap.containsKey(inputString.charAt(i))) {
        characterCountMap.put(inputString.charAt(i),
            characterCountMap.get(inputString.charAt(i)) + 1);
      } else {
        characterCountMap.put(inputString.charAt(i), 1);
      }
    }

    characterCountMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
        .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
  }
}