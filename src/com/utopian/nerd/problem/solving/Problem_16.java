package com.utopian.nerd.problem.solving;

import java.util.*;

/**
 * Program 16: Write a Java program to find out the first non-repeated character in the given string.
 */
public class Problem_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputString = sc.next();
        System.out.println("First non repeated character is: " + findFirstNonRepeatedCharacter(inputString));
    }

    private static String findFirstNonRepeatedCharacter(String inputString) {
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();

        for (int i = 0; i < inputString.length() - 1; i++) {
            characterIntegerMap.put(inputString.charAt(i), characterIntegerMap.containsKey(inputString.charAt(i)) ? characterIntegerMap.get(inputString.charAt(i)) + 1 : 1);
        }

        Optional<Character> nonRepeatedCharacter = characterIntegerMap.entrySet().stream().filter(characterIntegerEntry -> characterIntegerEntry.getValue() == 1).findFirst().map(characterIntegerEntry -> characterIntegerEntry.getKey());
        if (nonRepeatedCharacter.isPresent()) {
            return String.valueOf(nonRepeatedCharacter.get());
        } else {
            return "none found";
        }
    }
}
