import java.util.*;
public class duplicateparentheses {
    public static boolean dupParen(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                s.pop(); //for opening
                if(count < 1){
                    return true; //duplicate
                }
            } else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b)+((c+d)))"; //true
        System.out.println(dupParen(str));
    }
}