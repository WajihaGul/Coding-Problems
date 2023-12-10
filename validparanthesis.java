import java.util.*;

public class validparanthesis {
    public static void main(String[] args) {
        String testString1 = "()[]{}";
        String testString2 = "([{}])";
        String testString3 = "({[}])";

        System.out.println("Is valid (testString1): " + isValid(testString1));
        System.out.println("Is valid (testString2): " + isValid(testString2));
        System.out.println("Is valid (testString3): " + isValid(testString3));

    }

    public static boolean isValid(String s) {  
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                return false;
                }

            char lastopening = stack.pop();
            if((c==')' && lastopening!='(') || 
               (c=='}' && lastopening!='{') || 
               (c==']' && lastopening!='[')){
                   return false;
               }
            }
        }
   return stack.isEmpty();
    }
}