package Assignment_Java.Mod3.OOPS;

public class Shape2 {
    double area(double side){
        return side*side;
    }
    double area(double length,double breadth){//Method Overloading
        return length*breadth;
    }
}
class CircleArea extends Shape2{
    double area(double radius){//Method Overriding
        return 3.14*radius*radius;
    }
}
class DriveR{
    public static void main(String[] args) {
        Shape2 shape2=new Shape2();
        CircleArea ca1=new CircleArea();
        System.out.println("Area of square is:"+shape2.area(45));
        System.out.println("Area of rectangle is:"+shape2.area(15.7,21.67));//Method Overloading
        System.out.println("Area of circle is:"+ca1.area(30.55));//Method Overriding
    }

}
