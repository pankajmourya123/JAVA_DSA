package String;

public class OneTwo {
    public static void main(String[] args) {
        String s1 = "pankaj";
        String s2 = "shivam";
        StringBuffer s3 = new StringBuffer();

        for (int i = 0; i < s1.length(); i++) {
            int flag = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    flag = 1;
                }
            }

            if (flag != 1)
                s3.append(s1.charAt(i));
        }
        System.out.println(s3);

    }
}
