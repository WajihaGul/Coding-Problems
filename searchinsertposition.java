import java.util.Arrays;

class searchinsertposition {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 6, 8};
        int targett= 7;
        int result= searchInsert(arr,targett);
        System.out.println(result);

                // Test cases
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;

        int result1 = searchInsert(nums1, target1);
        int result2 = searchInsert(nums2, target2);
        int result3 = searchInsert(nums3, target3);
        int result4 = searchInsert(nums4, target4);

        System.out.println("Position to insert " + target1 + " in array " + Arrays.toString(nums1) + ": " + result1);
        System.out.println("Position to insert " + target2 + " in array " + Arrays.toString(nums2) + ": " + result2);
        System.out.println("Position to insert " + target3 + " in array " + Arrays.toString(nums3) + ": " + result3);
        System.out.println("Position to insert " + target4 + " in array " + Arrays.toString(nums4) + ": " + result4);
    }
    public static int searchInsert(int[] nums, int target) {
      int low =0;
      int high=nums.length-1;
    
      while(low<=high){
          int mid = low+(high-low)/2;
          if(nums[mid]==target){
              return mid;
          }
          else if(nums[mid]>target){
              high=mid-1;
          }
          else if(nums[mid]<target){
              low=mid+1;
          }
      }  
      return low;
    }
}