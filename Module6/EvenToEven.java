package Java_Assignment3.Module6;

public class EvenToEven {
    static void rearrange(int[] arr) {
        int n = arr.length;
        int evenIndex = 0;
        int oddIndex = 1;

        while(evenIndex < n && oddIndex < n) {

            if(arr[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }
            else if(arr[oddIndex] % 2 == 1) {
                oddIndex += 2;
            }
            else {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
          int[] arr={7,8,9,0,6,5};
          rearrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}