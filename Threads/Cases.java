package Threads;

class yes2 extends Thread {
    public void run() {
        try {
            for (int j = 1; j <= 3; j++) {

                System.out.println(j  +" ggg:" );
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class yes3 extends Thread {
    public void run() {
        try {
            for (int j = 1; j <= 3; j++) {

                System.out.println(j + "thridwala :" );
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Cases {
public static void main(String[] args) {
    yes2 y= new yes2();
    y.start();
    // y.run();

    yes2 y2= new yes2();
    y2.start();
    // y2.run();

    // yes3 y3= new yes3();
    // y3.start();
}
}
