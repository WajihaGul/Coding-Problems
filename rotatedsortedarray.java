/*
SEARCH ROTATED SORTED ARRAY
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 */

public class rotatedsortedarray {
public static void main(String[] args){
int[] nums1 = {4,5,6,7,0,1,2};
int target1 = 0;
System.out.println("For array {4,5,6,7,0,1,2}, The target " +target1+ " lies at " +rotatedarray(nums1,target1));
}   

public static int rotatedarray(int []nums, int target){
int low = 0;
int high = nums.length-1;

while(low<=high){
    int mid = (low+high)/2;
    if(nums[mid]==target) return mid;

    //if array's left is sorted
    if(nums[low]<=nums[mid]){
        //actually I am checking whether my target is in between mid and LOW or not
        if(nums[low]<=target && target<=nums[mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    //if the right side is sorted
    else{
        //actually I am checking whether my target is in between mid and high or not
        if(nums[mid]<=target && target<=nums[high]){
            low=mid+1;
            }
        else{
            high=mid-1;
            }
        }
    }
    return -1;
} 
}
