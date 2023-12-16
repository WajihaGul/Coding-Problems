/*
 * Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
 */

public class maxsubarrsy {
    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum sum of subarray is "+maxSubArraySum(arr));

        int[] arr2={5,4,-1,7,8};
        System.out.println("Maximum sum of subarray is "+maxSubArraySum(arr2));
    }
    public static int maxSubArraySum(int nums[]){
        int max_so_far=nums[0];
        int curr_max=nums[0];

        for(int i=1; i<nums.length; i++){
            curr_max=Math.max(nums[i],nums[i]+curr_max);
            max_so_far=Math.max(curr_max,max_so_far);
    }
        return max_so_far;
    }
}
