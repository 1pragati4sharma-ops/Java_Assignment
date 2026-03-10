package Java_Assignment3.Module6;

public class MissingNo  {
    public static void main(String[] args) {
        int n=5;
        int[] arr={1,2,4,5};
        int TotalSum= n*(n+1)/2;
        int actualSum=0;
        for (int i = 0; i < arr.length; i++) {
            actualSum+=arr[i];
        }
        System.out.println("Missing number is:"+(TotalSum-actualSum));
    }
}

