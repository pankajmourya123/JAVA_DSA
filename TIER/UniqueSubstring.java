package TIER;
// each  node in tier is an uniquse prifix of words;
// total nodes of trie =count of uniqune prefix;

// 1 find all suffix of string
// 2 create a trie from suffix
// 3 count nodes of trie
public class UniqueSubstring {

    static class Node{
        Node [] children=new Node[26];
        boolean eow;
          Node(){
            for (int i = 0; i < children.length; i++) {
                children[i]=null;
            }
          }
    }
    static Node root =new Node();
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

    public static int countNodes(Node root){
         if(root==null){
            return 0;
         }
         int count=0;
         for (int i = 0; i < 26; i++) {
            if (root.children[i]!= null) {
                count+=countNodes(root.children[i]);
            }
            
         }
         return count+1;
    }
    public static void main(String[] args) {
        String  words="apple";
       for (int i = 0; i < words.length(); i++) {
              String suffix=words.substring(i);
            //   System.out.println(suffix);
            insert(suffix);
       }
           System.out.println(countNodes(root));
            // ;
          
    }
}
