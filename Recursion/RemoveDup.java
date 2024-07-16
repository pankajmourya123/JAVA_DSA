package Recursion;

public class RemoveDup {
    static char [] map={'a','b','c'};
    public static void main(String[] args) {
        String str = "abcadbcefghabi";
boolean present[] = new boolean[str.length()];
System.out.println(removeDuplicates(str, 0, present));
    }
    public static String removeDuplicates(String str,int idx,boolean []present){
        if(idx==str.length()){
            return "";
        }
        char currchar=str.charAt(idx);
       if(present[currchar-'a']){
       return  removeDuplicates(str, idx+1, present);
       }else{
        present[currchar-'a']=true;
        return currchar + removeDuplicates(str, idx+1, present);
       }
    }
}
