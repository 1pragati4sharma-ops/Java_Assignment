package Assignment_Java.Mod3.OOPS;
//Single level Inheritance
public class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Driver1{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.bark();
    }
}
