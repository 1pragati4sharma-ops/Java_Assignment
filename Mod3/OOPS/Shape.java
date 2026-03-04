package Assignment_Java.Mod3.OOPS;

public class Shape {
    void view(){
        System.out.println("This is a shape");
    }
}
class Circle extends Shape{
    void view(){
        System.out.println("This is a circle");
    }
}
class Rectangle extends Shape{
    void view(){
        System.out.println("This is a rectangle");
    }
}
class Driver2{
    public static void main(String[] args) {
        Circle c1=new Circle();
        Rectangle r1=new Rectangle();
        c1.view();
        r1.view();
    }
}
