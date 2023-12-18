/*
125. Valid Palindrome
Solved
Easy
Topics
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */

public class validpalindrome {
    public static void main(String[] args){
        String s1= "hey  yeh";
        Boolean result= isPalindrome(s1);
        System.out.println(result);
        
    }

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder b = new StringBuilder();
        
        //Removing spaces
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        } 

        //Checking first and last character
        int n=b.length()-1;
        for(int i=0;i<b.length()/2;i++){
            if(b.charAt(i)!=b.charAt(n-i)){
                return false;
            }
        }
        return true;
} 
}
