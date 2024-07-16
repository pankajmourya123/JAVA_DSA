package arraysProgram;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class dulipcateway3 {
    public static void main(String[] args) {
        int[] a = { 12, 23, 12, 12, 23, 45, 54, 45 };
        Map<Integer, Integer> hm = new HashMap<>();
        for (int no : a) {
            Integer count = hm.get(no);
            if (count == null) {
                hm.put(no, 1);
            } else {
                count = count + 1;
                hm.put(no, count);
            }
        }
        Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
        for (Map.Entry<Integer, Integer> ms : es) {
            if (ms.getValue() > 1) {
                System.out.print(ms.getKey() + " ");
            }
        }
    }
}
