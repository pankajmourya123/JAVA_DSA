package Stack.PIP;

import java.util.Stack;

public class PrefixtoPost {
    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        System.out.println("Postfix: " + convert(prefix));
    }

    public static String convert(String exp){
        Stack<String> stack = new Stack<>();
        int length = exp.length();

        for (int i = length - 1; i >= 0; i--) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + op2 + c;
                stack.push(temp);
            }
        }

        return stack.pop();
    }
}
