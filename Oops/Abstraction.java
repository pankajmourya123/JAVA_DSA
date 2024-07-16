package Oops;

abstract class vehicle{
    abstract void start();
}

class car extends vehicle{
    void start(){
        System.out.println("1234567890-");
    }
    public static void main(String[] args) {
        car c= new car();
        c.start();

        scooter s=new scooter();
        s.start();

    
    }
}

class scooter extends vehicle{
    void start(){
        System.out.println("87645678876543567654");
    }
 
}