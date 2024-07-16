package Oops;

public class Animal {
    public static void main(String[] args) {
        System.out.println("!");
        Animal buzo= new Animal();
       
        buzo.running();
        buzo.eat();
    }
    public void eat() {
        System.out.println("I am eating");
    }

    public void running() {
System.out.println("runnig");
    }
}
