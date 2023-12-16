/*
Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
Output: Minimum Difference is 2 
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
Output: Minimum Difference is 6 

*/
import java.util.Arrays;
public class chocolatedistribution {
    public static void main(String[] args){
        //TEST CASES
        int[] arr1={3, 4, 1, 9, 56, 7, 9, 12};
        int m1=5;
        System.out.println("{3, 4, 1, 9, 56, 7, 9, 12} " + distributechocolates(arr1,m1));

        int[] arr2 = {7, 3, 2, 4, 9, 12, 56}; 
        int m2 = 3;
        System.out.println("{7, 3, 2, 4, 9, 12, 56} " + distributechocolates(arr2,m2));
    }
    public static int distributechocolates(int[]arr, int m){
        //m is the number of students and n is the size of array

        int mindifference=Integer.MAX_VALUE;
        int n=arr.length;

        //Sorting array to get min value at start and max value at end
        Arrays.sort(arr);

        for(int i=0; i+m-1<n;i++){
            int difference= arr[i+m-1]-arr[i];
            mindifference=Math.min(mindifference,difference);
        }
        return mindifference;
    }
}
