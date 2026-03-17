package Java_Assignment4.Module11;
// LeetCode 155 – Min Stack
import java.util.*;

class MinStack {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    public void push(int val){
        stack.push(val);

        if(minStack.isEmpty() || val<=minStack.peek())
            minStack.push(val);
    }

    public void pop(){
        if(stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args){
        MinStack s=new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.println(s.getMin());
    }
}
