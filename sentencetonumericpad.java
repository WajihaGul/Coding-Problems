/*
Convert a sentence into its equivalent mobile numeric keypad sequence
Video
Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence
Examples : 

Input: GEEKSFORGEEKS
Output: 4333355777733366677743333557777
Explanation: For obtaining a number, we need to press a number corresponding to that character for a number of times equal to the position of the character. For example, for character E, press number 3 two times and accordingly.
*/

public class sentencetonumericpad{
    public static void main(String[] args){
        String s1="geeksforgeeks";
        System.out.println("The equivalent mobile numeric keypad sequence is "+sequence(s1));
    }

public static String sequence(String s){
    StringBuilder sentence = new StringBuilder();
    
    if(s.isEmpty() || s==null){
        return " ";
    }
    
    int digit;
    for(char c:s.toLowerCase().toCharArray()){
        switch(c) {
            case 'a': case'b' : case 'c':
            digit =2;
            break;

            case 'd': case'e' : case 'f':
            digit =3;
            break;

            case 'g': case'h' : case 'i':
            digit =4;
            break;

            case 'j': case'k' : case 'l':
            digit =5;
            break;

            case 'm': case'n' : case 'o':
            digit =6;
            break;

            case 'p': case'q' : case 'r': case 's':
            digit =7;
            break;

            case 't': case'u' : case 'v':
            digit =8;
            break;

            case 'w': case'x' : case 'y': case'z':
            digit =9;
            break;

            case ' ':
            digit = 0;
            break;

            default:
            digit=1;
    }
         sentence.append(digit);
}
    return sentence.toString();
}
}