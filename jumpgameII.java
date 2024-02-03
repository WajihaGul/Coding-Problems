public class jumpgameII {
    public static void main(String[] args){
        int[] nums = {2, 3, 1, 1, 4};
        int result = jump(nums);
        System.out.println("Minimum number of jumps: " + result); // Output: 2
    }
    
    public static int jump(int[] nums){
        int destination=nums.length-1;
        int coverage=0;
        int totalJumps=0;
        int lastJumpIndex=0;

        //base case
        if(nums.length ==1)  return 0;
        for(int i=0;i<nums.length;i++){
            coverage=Math.max(coverage,  i + nums[i]);
            
            if(i==lastJumpIndex){
                lastJumpIndex=coverage;
                totalJumps++;
            

            //checking if we reached destination already
            if(coverage>=destination){
                return totalJumps;
            }
            }
        }
    return totalJumps;  
}
}
