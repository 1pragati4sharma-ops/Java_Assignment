package Java_Assignment2.Mod5ExceptionHandling;

public class DivByZero {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try {
            k=i/j;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally {
            System.out.println("this is the finally block");
        }
    }
}
