package Stack.PIP;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        System.out.println("Infix: " + convert(prefix));
    }

    public static String convert(String prefix) {
        Stack<String> st = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            } else {
               
                if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid prefix expression: " + prefix);
                }
                String a = st.pop();
                String b = st.pop();
                String temp = "(" + a + ch + b + ")";
                st.push(temp);
            }
        }

       
        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid prefix expression: " + prefix);
        }
        return st.pop();
    }
}
