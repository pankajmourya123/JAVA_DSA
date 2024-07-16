package TIER;
//seraching is fast 
// root node is an empty node
// prefix is not repeated 
//time complexcity length od largest word
//also know as prefix tree
public class Implementation {


   static class Node {
    Node  [] children =new Node[26];
    boolean eow;

    public Node(){
        for(int i=0;i<26;i++){
            children[i]=null;
        }
    }
    }

      static Node root =new Node();


     public static void insert (String word){
        Node curr=root;
      //as root static hai toh agar hum change karenge toh vo change hi rahegaa aur hum root ko kahi aur use karenge toh voo change wala hi used toh aisa naa hoo islye hum cuur bana rahe hai
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
     }

     public static boolean search(String key){
        Node curr = root;
        for (int i = 0; i < key.length(); i++) { //o(l) length of key
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null) {
                return false;
            }
            
            if (i == key.length() - 1 && !node.eow) {
                return false;
            }
            curr = node;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
       for (String word : words) {
           insert(word);
        //    System.out.println( word);
       }
System.out.println(search("their"));
    }
}
