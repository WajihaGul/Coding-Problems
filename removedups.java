/*
 * Print all the duplicate characters in a string

Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.

Example:

Input: S = “geeksforgeeks”
Output:

e, count = 4
g, count = 2
k, count = 2
s, count = 2
 */

public class removedups {

    public static void printDuplicateCharacters(String str) {
        // Assuming ASCII characters, create an array to store character frequencies
        int[] charFrequency = new int[256];

        // Traverse each character in the string and update the frequency in the array
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charFrequency[ch]++;
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 1) {
                System.out.println((char) i + " - " + charFrequency[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "geeksforgeeks";
        printDuplicateCharacters(inputString);
    }
}
