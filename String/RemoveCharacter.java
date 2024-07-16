package String;

public class RemoveCharacter {
    public static void main(String[] args) {
        String s ="pankaj";
    char c='a';

    String s1= "";
    for (int i = 0; i < s.length(); i++) {
        if(c!=s.charAt(i)){
            s1=s1+s.charAt(i);
        }

    }
    System.out.println(s1);

    }
}
