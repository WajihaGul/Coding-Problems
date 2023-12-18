public class removeconsecutivecharacter {
public static void main(String[] args){
    String str = "abcddddeeee";
    String result=removeCharacter(str);
    System.out.println("Input string : "+str+"\nOutput string: "+result);
}

public static String removeCharacter(String s){

    if(s == null || s.length() <= 1){
        return s;
    }

    StringBuilder t = new StringBuilder();
    t.append(s.charAt(0));

    for(int i=1;i<s.length();i++){
        if(s.charAt(i)!=s.charAt(i-1)){
            t.append(s.charAt(i));
        }
    }
    return t.toString();
}
}