package String;

public class Duplicaye {
    public static void main(String[] args) {
        String str = "pankajaaaaaaaaaa ";
        char[] ch = str.toCharArray();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            boolean repeat = false;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                str2.append(ch[i]);  // yeh stringbulider ka method hai but string ka nahi hai
            }

        }
        System.out.println(str2);
     
      
    }
}
