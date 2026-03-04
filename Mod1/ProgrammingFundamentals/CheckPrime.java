package Assignment_Java.Mod1.ProgrammingFundamentals;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i=2;i<n/2;i++){
            if (n%i==0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("The number is Prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
}
