package String;

public class NumOfWord {
    public static void main(String[] args) {
        String s= new String("pankaj");
        char[] ch = s.toCharArray();
        int count =0;
        for (int i = 0; i < ch.length; i++) {
         
    count++;
        } 
        System.out.println(count);
    }
}
