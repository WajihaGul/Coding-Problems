class palindrome{
 public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(-121));  // false
        System.out.println(isPalindrome(10));    // false
        System.out.println(isPalindrome(1221));  // true
        System.out.println(isPalindrome(12321)); // true
    }

    public static boolean isPalindrome(int x) {
    String s = String.valueOf(x); // Convert to String
    int i= 0;
    int j= s.length()-1;

    while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}
