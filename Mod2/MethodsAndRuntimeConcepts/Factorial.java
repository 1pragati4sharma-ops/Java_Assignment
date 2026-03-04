package Assignment_Java.Mod2.MethodsAndRuntimeConcepts;

import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if (n==1){
            return 1;
        }else{
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Factorial of "+n+" is "+fact(n));
    }
}
