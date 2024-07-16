package Threads;

public class TestThreads extends Thread{  //step 1extends thread class
    public void run(int a) {     //override the run() method
       System.out.println("Threads task"); 
    }
    public void start() {
        System.out.println("oooo");
    }
    public void run(){
        System.out.println("thread 2"); 
     }
    public static void main(String[] args) {
        TestThreads t=new TestThreads();  // create object of testthread class 
        t.start();
        // t.run(); here only simple test will called no thread is created
    }
}
