package Threads;

class Testt extends Thread{
public void run() {
    if(Thread.currentThread().isDaemon()){
  System.out.println("hhhh");
    }else{
        System.out.println("threads");
    }
   
}
}

// public class Daemon {
//     public static void main(String[] args) { //yaha par main khuch nahi kar raha isliye Testt  bhi khuch kaam nahi kar raha hai 
       
//         Testt t=new Testt();
//         t.setDaemon(true);
//         t.start();
//     }
// }

public class Daemon {
    public static void main(String[] args) { 
       System.out.println("main");
        Testt t=new Testt();
        // t.setDaemon(true);
        System.out.println(t.isDaemon());
        t.start();

       
        // t.start();
        // t.setDaemon(true);  // error 
    }
}