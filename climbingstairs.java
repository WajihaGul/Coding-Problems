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