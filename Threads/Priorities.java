package Threads;

class Test2 extends Thread{
    public void run() {
       Thread.currentThread().setPriority(5);
            System.out.println("1");
            
      
      
    }
}

class Test3 extends Thread{
    
    public void run() {
        Thread.currentThread().setPriority(MAX_PRIORITY);
       
            System.out.println("2");
        
      
    }
}


public class Priorities {
    public static void main(String[] args) {
      
        System.out.println("main");
System.out.println(Thread.currentThread().getPriority());
        Test2 t= new Test2();
        t.start();

        Test3 t3= new Test3();
        t3.start();
        System.out.println(t.getPriority());
    }
}
