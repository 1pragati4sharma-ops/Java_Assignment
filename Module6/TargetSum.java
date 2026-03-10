package Java_Assignment3.Module6;

public class TargetSum {

    public static void findPairs(int[] arr, int target) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair: " + arr[i] + " , " + arr[j]);
                }

            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15, 3, 6};
        int target = 9;

        findPairs(arr, target);
    }
}
