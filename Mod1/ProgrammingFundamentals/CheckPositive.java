package Assignment_Java.Mod1.ProgrammingFundamentals;

import java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = sc.nextInt();
        if (n>0){
            System.out.println("The number is positive");
        } else if (n==0) {
            System.out.println("The number is 0");
        }else{
            System.out.println("The number is negative");
        }
    }
}
