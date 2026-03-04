package Java_Assignment2.Mod4AdvJavaConcepts;


public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed: " + sb.reverse());
    }
}

