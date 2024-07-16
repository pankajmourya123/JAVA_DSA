package Recursion;

import String.palidromeString;

public class Permutationstring {
    public static void main(String[] args) {
        String str="abc";
        String newstring=" ";
        int n=str.length();
        Permutationstr(str,n,newstring);
    }
    public static void Permutationstr(String str,int idx,String newString ){
        if(str.length() == 0) {
            System.out.println(newString);
            return;
        }
       
        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            Permutationstr(newStr, idx+1, newString+currChar);
        }
 
    }
}
