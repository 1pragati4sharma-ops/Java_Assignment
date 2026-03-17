package Java_Assignment4.Module11;
 // LeetCode 150 – Evaluate Reverse Polish Notation
import java.util.*;

public class EvaluateRPN {

    public static int evalRPN(String[] tokens){
        Stack<Integer> stack=new Stack<>();

        for(String t:tokens){
            switch(t){
                case "+": stack.push(stack.pop()+stack.pop()); break;
                case "-":
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a-b);
                    break;
                case "*": stack.push(stack.pop()*stack.pop()); break;
                case "/":
                    int d=stack.pop();
                    int c=stack.pop();
                    stack.push(c/d);
                    break;
                default:
                    stack.push(Integer.parseInt(t));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args){
        String[] arr={"2","1","+","3","*"};
        System.out.println(evalRPN(arr));
    }
}
