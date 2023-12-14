class addbinary{
  public static void main(String[] args) {
   
    //TEST CASES
    String a1=  "1011";
    String b1 = "1100";
    String a2=  "1010";
    String b2 = "1100";
    String a3=  "0011";
    String b3 = "1101";

    String result1 = addBinary(a1, b1);
    String result2 = addBinary(a2, b2);
    String result3 = addBinary(a3, b3);
    
    System.out.println("Sum of binary numbers " +a1+ " and " +b1 +" is "+ result1);
    System.out.println("Sum of binary numbers " +a2+ " and " +b2 +" is "+ result2);
    System.out.println("Sum of binary numbers " +a3+ " and " +b3 +" is "+ result3);
  }
    public static String addBinary(String a, String b) {
      int carry=0;
      int alen = a.length();
      int blen = b.length();
      String result= "";
      int i=0;

      while(i<alen || i<blen || carry!=0){
          int x=0;
          if(i<alen && a.charAt(alen-1-i)=='1') x=1;
          
          int y=0;
          if(i<blen && b.charAt(blen-1-i)=='1')  y=1;

          result= (x+y+carry)%2+result;
          carry= (x+y+carry)/2;
          i++;
          }
        return result;
      }
}