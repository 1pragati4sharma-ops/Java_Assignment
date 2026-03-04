package Assignment_Java.Mod2.MethodsAndRuntimeConcepts;

public class Student {
    int USN;
    String Name;
    double Percent;

    public Student() {
        USN = 0;
        Name = "YourName";
        Percent = 0.0;
    }

    public Student(int USN, String Name, double Percent) {
        this.USN = USN;
        this.Name = Name;
        this.Percent = Percent;
    }
    void display(){
        System.out.println("USN: " + this.USN);
        System.out.println("Name: " + this.Name);
        System.out.println("Percent: " + this.Percent);
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student(101, "Ajay", 80.6);
        s2.display();
    }

}
