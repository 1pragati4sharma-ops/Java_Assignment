package Assignment_Java.Mod1.ProgrammingFundamentals;

import java.util.Scanner;

public class PatternPyramid {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n; i++){
            for(int sp=0;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for (int st=1;st<=2*i-1;st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
