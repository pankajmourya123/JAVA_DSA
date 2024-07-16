package java8feature;

// public class Anonmous {
//     public static void main(String[] args) {
//         Thread t = new Thread(new Runnable() {
//             public void run() {
//                 for (int i = 0; i < 10; i++) {
//                     System.out.println("Child Thread");
//                 }
//             }
//         });
//         t.start();
//         for (int i = 0; i < 10; i++)
//             System.out.println("Main thread");
//     }
// }


public class Anonmous {
    public static void main(String[] args) {
        Thread t = new Thread(()-> {
           
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            
        });
        t.start();
        for (int i = 0; i < 10; i++)
            System.out.println("Main thread");
    }
}