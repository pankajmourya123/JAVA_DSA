package Stack.PIP;

import java.util.Stack;

public class InfixToPrefix {

   public static String infixToPrefix(String infix) {
        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(infix);
        input.reverse();

        Stack<Character> stack = new Stack<>();
        char[] charsInfix = new String(input).toCharArray();

        for (int i = 0; i < charsInfix.length; i++) {
            if (charsInfix[i] == '(') {
                charsInfix[i] = ')';
                i++;
            } else if (charsInfix[i] == ')') {
                charsInfix[i] = '(';
                i++;
            }
        }

        for (int i = 0; i < charsInfix.length; i++) {
            char c = charsInfix[i];

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String infix = "A+B*(C^D-E)";
        System.out.println("Prefix: " + infixToPrefix(infix));
    }
}
