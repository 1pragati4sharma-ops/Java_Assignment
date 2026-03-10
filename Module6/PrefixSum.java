package Java_Assignment3.Module6;

public class PrefixSum{
    static int[] buildPrefix(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    static int rangeSum(int[] prefix, int l, int r) {
        if(l == 0) return prefix[r];
        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args) {
        int[] arr={3,4,5,6,7};
       int[] res= buildPrefix(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}

