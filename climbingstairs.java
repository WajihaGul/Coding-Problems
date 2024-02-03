/*
 70. Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
class climbingstairs{
    public static void main(String[] args) {
        //TEST CASES
        int n1 = 3;
        int n2 = 4;
        int n3 = 7;
        int n4 = 8;
        int n5 = 10;

        int result1= climbStairs(n1);
        int result2= climbStairs(n2);
        int result3= climbStairs(n3);
        int result4= climbStairs(n4);
        int result5= climbStairs(n5);

        System.out.println(n1 + " " + result1);
        System.out.println(n2 + " " + result2);
        System.out.println(n3 + " " + result3);
        System.out.println(n4 + " " + result4);
        System.out.println(n5 + " " + result5);
    }
    public static int climbStairs(int n) {
        if (n==1) return 1;

        int [] arr = new int[n+1];
        arr[1]=1;
        arr[2]=2;

        for(int i=3; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}