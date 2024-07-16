package collectionsFramework;

import java.util.Stack;

public class Stacktest {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        // s.push(9);
        // s.push(("iiiiii"));
        // s.add("pihhugu");
        // s.push(0);
        // s.pop();
        // System.out.println(s.peek());
        // System.out.println(s.search(9));
        // System.out.println(s.toString());
               int[] array = s.stream().mapToInt(Integer::intValue).toArray();
    }
}
