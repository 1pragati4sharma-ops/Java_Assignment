package Java_Assignment4.Module11;
// LeetCode 239 – Sliding Window Maximum
import java.util.*;

public class SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums,int k){
        Deque<Integer> dq=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        int i=0;

        for(int j=0;j<nums.length;j++){

            while(!dq.isEmpty() && dq.peek()<j-k+1)
                dq.poll();

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[j])
                dq.pollLast();

            dq.offer(j);

            if(j>=k-1)
                res[i++]=nums[dq.peek()];
        }

        return res;
    }

    public static void main(String[] args){
        int[] arr={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr,3)));
    }
}
