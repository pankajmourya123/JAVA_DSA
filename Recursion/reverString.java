package Recursion;

public class reverString {
    public static void main(String[] args) {
        String str="abcd";
        int n=str.length()-1;
        
        reverstr(str,n);
    }
    public static void reverstr(String str,int n){
        if(n<0){
            return;
        }
        System.out.print(str.charAt(n));
        reverstr(str, n-1);
    }
}
