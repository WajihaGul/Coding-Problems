/*
 * 242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */

public class validanagram {
    public static void main(String[] args){
        String s1="wajiha";
        String t1="ajiwah";
        boolean result = isAnagram(s1,t1);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t){
         // Check if the lengths of both strings are equal
        if(s.length()!=t.length()){
            return false;
        }

         // Use arrays to represent the count of characters
        int[] a = new int[26];  // Assuming only lowercase letters 
        int[] b = new int[26];

        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;   //increment the count of character in array a
            b[t.charAt(i)-'a']++;   //increment the count of character in array b
        }

        // Compare the arrays
        for(int i=0;i<26;i++){
        if(a[i]!=b[i]){
            return false;
        }
    }
        return true;
    }

}
