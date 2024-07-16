package Recursion;

public class SubsquenceStr {
    public static void main(String[] args) {
        String str="abc";
        String newstring="";
        int s=0;
        allSubseq(str,newstring,s);
    }
    public static void allSubseq(String str,String newString,int idx){
        if(idx==str.length()){
            System.out.println(newString);
            return ;
        }
        char ch=str.charAt(idx);
    //if want to contribute
    allSubseq(str, newString+ch, idx+1);
    //if don't want contribute
    allSubseq(str, newString, idx+1);

    }
}
