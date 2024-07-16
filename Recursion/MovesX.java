package Recursion;

public class MovesX {
    public static void main(String[] args) {
        String str="xxxabcd";
       int count=0;
       String newstr="";
       
        xkomovekaro(str,0,count ,newstr);
       
    }
    public static void xkomovekaro (String str ,int s,int count,String newString){
        if(s==str.length()-1){
            // System.out.println(newString);
            return ;
        }
        if(str.charAt(s)=='x'){
            count++;
            xkomovekaro(str, s+1, count, newString);
        }else{
            newString+=str.charAt(s);
           xkomovekaro(str, s+1, count, newString);
        }
        
    }
}
