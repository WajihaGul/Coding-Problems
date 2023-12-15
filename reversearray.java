class reversearray {
public static void main(String[] args){
   //TEST CASES
    /*
   int[] arr1= {1,2,3};
   revarr(arr1);
   System.out.print("Original Array is {1,2,3} and Reversed array is: ");
   printArray(arr1);
   */

   int[] arr2= {4,5,6,7,8};
   revarr(arr2);
   System.out.println("\nOriginal Array is {4,5,6,7,8} and Reversed array is: ");
   printArray(arr2);
}   

public static void revarr(int[] arr){
int start= 0;
int end= arr.length-1;

//Swapping
while (start < end) {
    int temp= arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
    }
}

//print reversed array
public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}