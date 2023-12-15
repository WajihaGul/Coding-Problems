public class maxsubarrsy {
    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum sum of subarray is "+maxSubArraySum(arr));
    }
    public static int maxSubArraySum(int nums[]){
        int sum=0;
        int maxsum=nums[0];

        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            if(sum>maxsum){
            maxsum=sum;
        }
        else if(sum<0){
            sum=0;
        }
    }
        return maxsum;
    }
}
