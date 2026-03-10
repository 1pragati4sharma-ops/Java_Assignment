package Java_Assignment3.Module6;

public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int globalMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            if (currentMax > globalMax) {
                globalMax = currentMax;
            }
        }

        return globalMax;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, 5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(numbers));
    }
}

