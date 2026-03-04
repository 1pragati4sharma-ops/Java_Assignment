package Java_Assignment2.Mod4AdvJavaConcepts;

class Student {
    int roll;
    String name;
    static String college = "Sapthagiri College";

    static void changeCollege() {
        college = "Sapthagiri University";
    }

    Student(int rollNo, String Name) {
        roll = rollNo;
        name = Name;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege();

        Student s1 = new Student(101, "Ravi");
        Student s2 = new Student(102, "Ajay");

        s1.display();
        s2.display();
    }
}


