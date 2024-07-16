package Threads;

class Test extends Thread {
    public void run() {
        try {
            Thread.yield();
            for (int i = 1; i <= 3; i++) {
                System.out.println(i + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class yeild {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
       
     
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i + " ");
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
