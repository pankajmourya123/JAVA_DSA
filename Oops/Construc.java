package Oops;

public class Construc {
    String name;
        int id;
        Construc(String c,int b){
            this.name=c;
            this.id=b;
            System.out.println(name +" "+id);
        }
    public static void main(String[] args) {
        Construc cs =new Construc("pankaj", 23);
        Construc cs1=new Construc("shivam", 20);

    }
}
