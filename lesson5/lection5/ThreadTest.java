package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson5.lection5;
public class ThreadTest {
    public static void main(String ... args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
    }
}

class MyThread extends Thread {
    public void run(){
        System.out.println("Hello from "+this.getName());
    }
}
