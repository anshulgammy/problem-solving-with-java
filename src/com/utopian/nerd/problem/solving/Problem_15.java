package com.utopian.nerd.problem.solving;

import java.util.Scanner;

/**
 * Program 15: Write a Java program to search for an element in a sorted array using binary search.
 */
public class Problem_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sorted elements, separated by comma:");
        String[] inputArray = sc.next().split(",");
        System.out.println("Enter the element to search: ");
        String element = String.valueOf(sc.nextInt());
        System.out.println("Element is present at: " + searchElement(inputArray, element));
    }

    private static String searchElement(String[] inputArray, String element) {
        int low = 0;
        int high = inputArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (inputArray[mid].equals(element))
                return String.valueOf(mid);
            else if (Integer.parseInt(inputArray[mid]) > Integer.parseInt(element))
                high = --mid;
            else if (Integer.parseInt(inputArray[mid]) < Integer.parseInt(element))
                low = ++mid;
        }
        return "-1";
    }
}
