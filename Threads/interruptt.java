package Threads;

public class interruptt extends Thread{
    public void run() {
        try {
            for (int i = 0; i <=3; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e+"uujujjj");
        }
    }

    public static void main(String[] args) {
        interruptt it = new interruptt();
        it.start();
        it.interrupt();
    }
}
