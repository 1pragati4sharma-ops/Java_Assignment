package Java_Assignment4.Module9;
 // LeetCode 22 – Generate Parentheses
import java.util.*;

public class GenPara {

    static List<String> result=new ArrayList<>();

    static void backtrack(String cur,int open,int close,int max){
        if(cur.length()==max*2){
            result.add(cur);
            return;
        }

        if(open<max)
            backtrack(cur+"(",open+1,close,max);

        if(close<open)
            backtrack(cur+")",open,close+1,max);
    }

    public static void main(String[] args){
        backtrack("",0,0,3);
        System.out.println(result);
    }
}
