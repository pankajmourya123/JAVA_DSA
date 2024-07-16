package java8feature;

// class MyRunnable implements Runnable {
//     public void run() {   
//                       for(int i=0; i<10; i++) {            
//                                System.out.println("Child Thread");   
//                       }   
//               }
// }

// class Treadtest {
//     public static void main(String[] args) {   
//                          Runnable r = new MyRunnable();   
//                          Thread t = new Thread(r);   
//                          t.start();   
//                          for(int i=0; i<10; i++) {   
//                                   System.out.println("Main Thread") ;  
//                          }   
//             }
//         }


class MyRunnable implements Runnable {
    public void run() {   
                      
              }
}

class Treadtest {
    public static void main(String[] args) {   
                         Runnable r = ()->{
                            for(int i=0; i<10; i++) {            
                               System.out.println("Child Thread");   
                      } 
                         };   
                         Thread t = new Thread(r);   
                         t.start();   
                         for(int i=0; i<10; i++) {   
                                  System.out.println("Main Thread") ;  
                         }   
            }
        }