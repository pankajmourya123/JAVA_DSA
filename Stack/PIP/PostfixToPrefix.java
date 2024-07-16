package Stack.PIP;
import java.util.Stack;
public class PostfixToPrefix {
   public static void main(String[] args) {
    String postfix = "ABC/-AK/L-*";
        System.out.println("Prefix: " + convert(postfix));
   } 

   public static String convert(String postfix){
    Stack<String> st=new Stack<>();
    for (int i = 0; i < postfix.length(); i++) {
        char ch=postfix.charAt(i);
    if(Character.isLetterOrDigit(ch)){
        st.push(ch+" ");
    }
    else{
        String b=st.pop();
        String a=st.pop();
        String temp=ch+ a+b;
        st.push(temp);
    }
}
return st.pop();
}
}