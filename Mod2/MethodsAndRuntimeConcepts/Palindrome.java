package Assignment_Java.Mod2.MethodsAndRuntimeConcepts;

import java.util.Scanner;

public class Palindrome {
    static boolean Pali(String str){
        String temp = "";
        for(int i =str.length()-1; i>=0; i--){
            temp += str.charAt(i);
        }
        if (temp.equals(str)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (Pali(str)){
            System.out.println("The String is Palindrome");
        }else{
            System.out.println("The String is not Palindrome");
        }
    }
}
