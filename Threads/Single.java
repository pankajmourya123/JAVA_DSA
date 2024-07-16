package Threads;
//1.performing single task from single thread.

// class Test extends Thread{
//     public void run() {
//         System.out.println("pankaj");
//     }
// }

// public class Single {
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.start();
//     }
// }

//2.performing single task from multiple threads

// class Multiple extends Thread {
//     public void run() {
//         System.out.println("pankaj");
//     }
// }

// public class Single {
//     public static void main(String[] args) {
//         Multiple t = new Multiple();
//         t.start();

//         Multiple t2 = new Multiple();
//         t2.start();
//     }
// }


//3.performing multiple task from single thread

// it can be perform because does dont support multiple

//4.performing multiple task from multiple threads
class Multiple extends Thread {
    public void run() {
        System.out.println("pankaj 1");
    }
}

class Multiple2 extends Thread {
    public void run() {
        System.out.println("pankaj 2");
    }
}

class Multiple3 extends Thread {
    public void run() {
        System.out.println("pankaj ");
    }
}
public class Single {
    public static void main(String[] args) {
        Multiple t = new Multiple();
        t.start();

        Multiple2 t2 = new Multiple2();
        t2.start();

        Multiple3 t3 = new Multiple3();
        t3.start();

        // Multiple3 t3 = new Multiple3();
        t3.start();//here it will error because once start then will end and dead so we cannot reborn a thread
    }
}