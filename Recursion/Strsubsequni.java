package Recursion;

import java.util.HashSet;

public class Strsubsequni {
    public static void main(String[] args) {
        String str="abc";
        String newstring=" ";
        HashSet<String> allSubseq=new HashSet<>();
        remsubuni(str,0,newstring,allSubseq);
    }
    public static void remsubuni(String str,int idx,String newString,HashSet<String>
allSubseq){
        if(idx==str.length()){
            if(allSubseq.contains(newString)) {
                return;
                }
                allSubseq.add(newString);
                System.out.println(newString);
                return;
        }
        char ch=str.charAt(idx);
        //choose
        remsubuni(str, idx+1, newString+ch,allSubseq);
        //donnot choose 
        remsubuni(str, idx+1, newString,allSubseq);
    }
}
