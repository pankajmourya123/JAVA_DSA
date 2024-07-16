package Threads;

class Test extends Thread{
public void run() {
    // System.out.println("thread 1");
    System.out.println(Thread.currentThread().getName());
    System.out.println( Thread.currentThread().isAlive());
    // Thread.currentThread().setName("pankaj");
    // System.out.println(Thread.currentThread().getName());
}
}

public class Method {
    public static void main(String[] args) {
        // System.out.println("main thread");
        // System.out.println(Thread.currentThread().getName());
        // Thread.currentThread().setName("pankaj");
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread());
        // System.out.println(Thread.currentThread().isAlive());
        Test t= new Test();
        // t.setName("pankajk");
        t.start();
        System.out.println( t.isAlive());
      
    }
}
