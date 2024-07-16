package Recursion;

public class Countzero {
    public static void main(String[] args) {
        int n=123000;
       helper(n);
    }
    public static void helper(int i){
        int res=countzero(i,0);
        // System.out.println(res);
    }
    public static int countzero(int i,int count){
        if(i==0){
            return count;
        }
        int rem=i%10;
        if(rem==0){
            return countzero(i/10,count+1);
        }
        return countzero(i/10,count);
    }

    }

