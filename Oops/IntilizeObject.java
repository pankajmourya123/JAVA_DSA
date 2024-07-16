package Oops;

public class IntilizeObject {
    String name;
    int age;
void intobj(String c,int b){
name=c;
age=b;
}
void Display(){
    System.out.println(name+" "+age);
}
    public static void main(String[] args) {
        IntilizeObject buzo=new IntilizeObject();
     buzo.intobj("pankaj",22);
   buzo.Display();
    }
}
