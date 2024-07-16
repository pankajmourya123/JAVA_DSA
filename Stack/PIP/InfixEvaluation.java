package Stack.PIP;
// Rules and Key Points:

import java.util.Stack;

// Operator Precedence: Operators with higher precedence should be evaluated first. The precedence of * and / is higher than + and -.
// Associativity: Operators of the same precedence should be evaluated based on their associativity (left-to-right for +, -, *, /).
// Parentheses: Handle ( and ) by pushing and popping from the stack to ensure the correct order of evaluation.

// method determines if op2 has higher or equal precedence over op1
import java.util.Stack;

public class InfixEvaluation {

    public static int evaluateInfix(String exp){
        Stack<Integer> values=new Stack<>();
        Stack<Character> ops=new Stack<>();
       for (int i = 0; i <exp.length(); i++) {
        char ch=exp.charAt(i);
        if(Character.isDigit(ch)){
            values.push(ch-'0');
        }
        else if(ch=='('){
            ops.push('(');
        }else if(ch==')'){
            while (ops.peek() !='(') {
                values.push(applyOp(ops.pop(), values.pop(), values.pop()));
            }
            ops.pop();
        }else if(ch=='+'||ch=='-'||ch=='*'|| ch=='/'){
            while (!ops.empty()&& hasPrecedence(ch,ops.peek())) {
                values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
            }
            ops.push(ch);
        }
       }
       while (!ops.empty()) {
        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
       }
       return values.pop();
    }
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        String expression = "9-5+3*4/6";
        System.out.println("Result: " + evaluateInfix(expression));
    }
}
