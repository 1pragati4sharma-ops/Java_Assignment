package Assignment_Java.Mod2.MethodsAndRuntimeConcepts;

public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }
    static float add(float a, float b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2,3));
        System.out.println(add(2,3));
        System.out.println(add(2.8,3.6));
        System.out.println(add(4.3f, 5.6f));
}}
