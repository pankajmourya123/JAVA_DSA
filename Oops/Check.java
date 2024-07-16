package Oops;
class Jump{
    int i;
  Jump(int j){
  i=j;
  }
  void show(){
    System.out.println(i);
  }
}

public class Check {
   public static void main(String[] args) {
    Jump t= new Jump(11);
    t.show();
   } 
}
