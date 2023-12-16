/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
 */
import java.util.Arrays;

public class duplicates {
    public static void main(String[] args){
        //TEST CASE
        int arr[] = {1, 2, 3, 4, 5, 1};
        System.out.println("The duplicates in array {1, 2, 3, 4, 5, 1} " + (checkduplicate(arr)));
       
    }
    public static Boolean checkduplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
        }
    return false;
    }
}