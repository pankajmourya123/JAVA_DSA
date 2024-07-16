package Recursion;

public class Name {
    public static void main(String[] args) {
         int n=5;
  printName(1,n);  
    }
   static public void printName(int i,int n ){
  if(i>n){
    return;
  }
// System.out.println("pankaj");
printName(i+1, n);

 }
}
 
