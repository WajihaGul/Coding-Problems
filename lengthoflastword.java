class lengthoflastword {
    public static void main(String[] args) {
        String s1=" Wajiha  Gul  ";
        int result= lengthOfLastWord(s1);
        System.out.println("The length of String " +s1+ " is " +result);

                // Test cases
                String str1 = "Hello World";
                String str2 = "   ";
                String str3 = "Hello ";
                String str4 = "  GPT-3.5   ";
        
                int result1 = lengthOfLastWord(str1);
                int result2 = lengthOfLastWord(str2);
                int result3 = lengthOfLastWord(str3);
                int result4 = lengthOfLastWord(str4);
    
                System.out.println("Length of last word in \"" + str1 + "\": " + result1);
                System.out.println("Length of last word in \"" + str2 + "\": " + result2);
                System.out.println("Length of last word in \"" + str3 + "\": " + result3);
                System.out.println("Length of last word in \"" + str4 + "\": " + result4);
                }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int j=s.length()-1;
        
        while (j >= 0 && s.charAt(j) == ' ') {
            j--;
        }

        while(j>=0 && s.charAt(j)!=' '){
                count++;
                j--;
            }
        
    return count;
    }
}                                                        