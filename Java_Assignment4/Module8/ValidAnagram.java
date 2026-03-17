package Java_Assignment4.Module8;

import java.util.Arrays;
import java.util.Scanner;

//LeetCode 242-Valid Anagram
public class ValidAnagram {
    static boolean isAnagram(char[] str1,char[] str2) {
        if (str1.length!=str2.length){
            System.out.println("The strings are not anagram");
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1,str2);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        char[] str1= sc.next().toCharArray();
        System.out.println("Enter the second string:");
        char[] str2= sc.next().toCharArray();
        System.out.println(isAnagram(str1,str2));
    }
}
