package TIER;
 
public class Wordbreak {
    static class Node{
        Node [] children =new Node[26];
        boolean eow;

        Node(){
            for (int i = 0; i < 26; i++) {
                children[i]=null;
            }
           
        }
    }

 static Node root=new Node();

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

    static boolean sreach(String key ){
        Node curr=root;
        for (int i = 0; i < key.length(); i++) {
            int idx =key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            if(i==key.length()-1 && !curr.children[idx].eow){
                return false;
            }

            curr=curr.children[idx];
        }
        return true;
    }

   public static boolean wordbrk (String key){
    if(key.length()==0){
        return true;
    }
  for (int i = 1; i <= key.length(); i++) {
        if(sreach(key.substring(0,i))&& wordbrk(key.substring(i))){
            return true;
        }
  }
  return false;
   } 
    public static void main(String[] args) {
        String [] words={"the", "a", "there", "their", "any", "thee"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
            // System.out.println(words[i]);
        }

        System.out.println(sreach("the"));
        System.out.println(wordbrk("jjjjj"));
    }
}
