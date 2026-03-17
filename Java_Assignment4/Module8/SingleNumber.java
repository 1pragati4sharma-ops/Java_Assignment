package Java_Assignment4.Module8;

 // LeetCode 136 – Single Number using XOR
public class SingleNumber {
    public static int singleNumber(int[] nums){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr={2,2,1,3,1};
        System.out.println(singleNumber(arr));
    }
}
