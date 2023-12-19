/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

import java.util.Arrays;

public class longestcommonprefix {
    public static void main(String[] args){
        String [] strs1 = {"flower","flow","flight"};
        //String result1=
        System.out.println("Longest common prefix: " + longestCommonPrefix(strs1));
    }


public static String longestCommonPrefix(String[] strs){
    StringBuilder result =new StringBuilder();

    Arrays.sort(strs);

    //putting first element on first and last element on last
    char[] first=strs[0].toCharArray();
    char[] last=strs[strs.length-1].toCharArray();

    //Checking with length of either string
    for(int i=0;i<first.length;i++){
        if(first[i]==last[i]){
            result.append(first[i]);
        }
        else if(first[i]!=last[i]){
            break;
        }
    }
    return result.toString();
}
}