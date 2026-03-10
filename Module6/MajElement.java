package Java_Assignment3.Module6;

public class MajElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 2, 2, 1, 2};
        int n = arr.length;
        int count = 0;
        int candidate = arr[0];
        for (int i = 0; i < n; i++) {
            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }

        }
        System.out.println("Majority Element is:" + candidate);
        //candidate verification
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count > n / 2) {
            System.out.println("Majority Element:" + candidate);
        } else {
            System.out.println("No majority element");
        }
    }
}