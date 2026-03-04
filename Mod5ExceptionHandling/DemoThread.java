package Java_Assignment2.Mod5ExceptionHandling;

class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread "+i+" extends thread class.");
        }
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread "+i+" implements runnable interface.");
        }
    }
}
public class DemoThread {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
        Thread2 obj=new Thread2();
        Thread t2=new Thread(obj);
        t2.start();
    }

}
