package Oops;


interface I1{
abstract void show();
}


interface I2{
    abstract void Display();
    }

 class Interface implements I1,I2{
   public void show(){
        System.out.println("23456789");
    }

   public void Display(){
        System.out.println("23456789876543");
    }

    public static void main(String[] args) {
        Interface i = new Interface();
        i.show();
        i.Display();
    }
}
