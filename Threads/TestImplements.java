package Threads;

public class TestImplements implements Runnable {
    public void run(int a){
       System.out.println("thread 1 "); 
    }
    public void start() {
        System.out.println("oooo");
    }
    public void run(){
        System.out.println("thread 2"); 
     }
    public static void main(String[] args) {
        TestImplements t= new TestImplements();
        Thread th=new Thread(t);
        th.start();

    }
}


 
