import java.util.Arrays;

class removeelement {
    public static void main(String[] args) {
        // Test the removeElement method
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println("Original Array: " + Arrays.toString(nums));
        
        int newLength = removeElement(nums, val);

        System.out.println("New Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
    return j;
    }
}