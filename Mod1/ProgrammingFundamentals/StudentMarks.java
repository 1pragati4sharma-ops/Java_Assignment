package Assignment_Java.Mod1.ProgrammingFundamentals;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks: ");
        int n = sc.nextInt();
        if (n>80){
            System.out.println("A Grade");
        } else if (n>70) {
            System.out.println("B Grade");
        } else if (n>60) {
            System.out.println("C Grade");
        } else if (n>50) {
            System.out.println("D Grade");
        } else if (n>40) {
            System.out.println("E Grade");
        }else{
            System.out.println("F Grade");
        }
    }
}
