package Stack.PIP;

import java.util.Stack;

public class PrefixfixEvaluation {
    public static void main(String[] args) {
        
    }

    public static int prefixfixEvalution(String exp){
        Stack<Integer> st=new Stack<>();
            for (int i = exp.length()-1; i >=0; i--) {
               char ch=exp.charAt(i); 

               if (Character.isDigit(ch)) {
                st.push(ch-'0');
               } else {
                int a=st.pop();
                int b=st.pop();
                switch (ch) {
                    case '+':st.push(a+b);
                    break;
                    case '-':
                    st.push(a - b);
                    break;       
                    case '*':
                    st.push(a * b);
                    break; 
                    case '/':
                    st.push(a / b);
                    break;    
                }
               }
            }
            return st.pop();
    }
   
}
