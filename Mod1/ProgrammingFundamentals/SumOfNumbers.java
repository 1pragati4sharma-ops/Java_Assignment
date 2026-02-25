package Assignment_Java.Mod1.ProgrammingFundamentals;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0,i=0;
        while(i<=100){
            sum+=i;
            i+=2;
        }
        System.out.println("Sum of Even numbers upto 100= "+sum);
    }
}
