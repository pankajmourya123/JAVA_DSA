package Stack.PIP;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String postfix = "abc++";
        System.out.println("Infix: " + convert(postfix));
    }

    public static String convert(String postfix) {
        Stack<String> st = new Stack<>();
        int len = postfix.length();

        for (int i = 0; i < len; i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            } else {
          
                if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid postfix expression: " + postfix);
                }
                String b = st.pop();
                String a = st.pop();
                String temp = "(" + a + ch + b + ")";
                st.push(temp);
            }
        }

       
        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression: " + postfix);
        }
        return st.pop();
    }
}
