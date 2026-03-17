package Java_Assignment4.Module9;
 // LeetCode 39 – Combination Sum
import java.util.*;

public class CombinationSum {
    static List<List<Integer>> result=new ArrayList<>();

    static void dfs(int[] nums,int target,int start,List<Integer> temp){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<nums.length;i++){
            if(nums[i]>target) continue;

            temp.add(nums[i]);
            dfs(nums,target-nums[i],i,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        int[] arr={2,3,6,7};
        dfs(arr,7,0,new ArrayList<>());
        System.out.println(result);
    }
}

