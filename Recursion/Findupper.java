package Recursion;

public class Findupper {
    public static void main(String[] args) {
        String str = "Jai shree ram";
        int n=str.length()-1;
        
        findupperchar(str,n);

    }
    public static void findupperchar(String s,int n){
        if(n<0){
            
            return;
        }
        if(Character.isUpperCase(s.charAt(n))) {
            System.out.println(s.charAt(n)); 
        }
        findupperchar(s, n-1);
    }
}
