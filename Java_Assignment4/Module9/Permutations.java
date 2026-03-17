package Java_Assignment4.Module9;

// LeetCode 46 – Permutations
import java.util.*;

public class Permutations {
    static List<List<Integer>> result=new ArrayList<>();

    static void backtrack(int[] nums,List<Integer> temp){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int n:nums){
            if(temp.contains(n)) continue;
            temp.add(n);
            backtrack(nums,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        int[] arr={1,2,3};
        backtrack(arr,new ArrayList<>());
        System.out.println(result);
    }
}
