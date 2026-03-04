package Assignment_Java.Mod1.ProgrammingFundamentals;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i =0;i<3;i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0]>=arr[1]&&arr[0]>=arr[2]){
            System.out.printf("%d is the largest", arr[0]);
        } else if ((arr[1]>arr[0]&&arr[1]>arr[2])) {
            System.out.printf("%d is the largest", arr[1]);
        } else{
            System.out.printf("%d is the largest", arr[2]);
        }
    }
}
