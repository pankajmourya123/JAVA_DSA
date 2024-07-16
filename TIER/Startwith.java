package TIER;

public class Startwith {
    static class Node{
        Node [] children =new Node[26];
        boolean eow;

        Node (){
            for (int i = 0; i < children.length; i++) {
               children[i]=null; 
            }
        }
    }
    public  static Node root=new Node();
    public static void insert(String words){
       Node curr=root;
       for (int i = 0; i < words.length(); i++) {
        int idx=words.charAt(i)-'a';
    if(curr.children[idx]==null){
        curr.children[idx]=new Node();
    }
    
    if(i==words.length()-1){
        curr.children[idx].eow=true;
    }
    curr=curr.children[idx];
       }
    }

    public static boolean swith(String key){
        Node curr=root;
        for (int i = 0; i < key.length(); i++) {
            int idx =key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
     String [] words={"the", "a", "there", "their", "any", "thee"}  ;
     for (String string : words) {
      insert(string);  
    //   System.out.println(string);
     } 
     System.out.println(swith("an"));
    }
}
