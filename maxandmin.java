/*
Given an array of size N. The task is to find the maximum and the minimum element of the array using
the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
        Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
         Maximum element is: 35
*/

import java.util.*;
class maxandmin{
    public static void main(String[] args) {
    //TEST CASES
    int arr1[] = {3, 5, 4, 1, 9};
    int s1=arr1.length;
    maxmin(arr1,s1);
    
    int arr2[] = {22, 14, 8, 17, 35, 3};
    int s2=arr2.length;
    maxmin(arr2,s2);
    }

    public static void maxmin(int[]arr, int s){
        //Sort array
        Arrays.sort(arr);

        // Step 2: The first element is the minimum
        int min=arr[0];

        // Step 3: The last element is the maximum
        int max=arr[s-1];

        // Step 4: Print the minimum and maximum elements
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);

    }
}
