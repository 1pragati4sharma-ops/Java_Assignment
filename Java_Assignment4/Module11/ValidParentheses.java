package Java_Assignment4.Module11;
// LeetCode 20 – Valid Parentheses
import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else{
                if(stack.isEmpty()) return false;

                char top=stack.pop();

                if(c==')' && top!='(') return false;
                if(c=='}' && top!='{') return false;
                if(c==']' && top!='[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        System.out.println(isValid("()[]{}"));
    }
}
