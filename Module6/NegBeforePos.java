package Java_Assignment3.Module6;

public class NegBeforePos  {
    static void rearrange(int[] arr) {
        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={7,8,9,-4,-3,-10};
        rearrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
