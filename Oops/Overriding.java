package Oops;

abstract class Test{
    abstract void Display();
     
}


class xyz extends Test{
    void Display(){
        System.out.println("6");
    }
    public static void main(String[] args) {
        xyz x=new xyz();
        x.Display();
    }
}
