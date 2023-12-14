class mergesortedarray{
    public static void main(String[] args) {
        /*int[] numsa1= {1,2,3,0,0,0};
        int[] numsb1 = {2,5,6};
        int m1=3;
        int n1=3;

        int result = merge(numsa1,m1,numsb1,n1);
       */ 
        mergesortedarray merger = new mergesortedarray();

        // Example usage:
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merger.merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int mi=m+n-1;

        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
            nums1[mi]=nums1[p1];
            p1--;
            }
            else{
            nums1[mi]=nums2[p2];
            p2--;
            }
            mi--;
        }

        while(p2>=0){
            nums1[mi]=nums2[p2];
            p2--;
            mi--;
        }
    }
}