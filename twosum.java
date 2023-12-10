class twoSum {
    public static int[] twoSumm(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    // Find and print the indices of the two numbers
    int[] result = twoSumm(nums, target);
    System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
}
}