package Threads;


class Frist extends Thread{
    static Thread  mainthread;
    public void run() {
       try {
        mainthread.join();
        for (int i = 0; i <=4; i++) {
            System.out.println(i+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        
       } catch (Exception e) {
      System.out.println(e);
       }
    }
}


public class Jion {
    static Thread  mainthread;
    public static void main(String[] args) throws InterruptedException{
  mainthread =Thread.currentThread();
        Frist f = new Frist();
        f.start();
        try {
            f.join();
            for (int i = 0; i <=4; i++) {
                System.out.println(i+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            
           } catch (Exception e) {
          System.out.println(e);
           }
    }
}
