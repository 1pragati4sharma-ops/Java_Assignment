package Java_Assignment3.Module6;

public class DifferenceArray {
    static void rangeUpdate(int[] arr, int l, int r, int val) {
        int n = arr.length;
        int[] diff = new int[n];

        diff[l] += val;
        if(r + 1 < n) diff[r + 1] -= val;

        arr[0] += diff[0];
        for(int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
            arr[i] += diff[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        rangeUpdate(arr,1,3,8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}}


