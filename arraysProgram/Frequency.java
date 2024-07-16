package arraysProgram;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] arr={20,30,40,50,70,70};
        // HashMap hm=new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        // for (int num : arr) {
        //     countMap.put(num, countMap.getOrDefault(num, 0)+1 );
        // }
        // System.out.println(countMap);
        int key=1;
        for (int i : arr) {
            if(countMap.containsKey(i)){
                countMap.put(i,key+1);
            }
            else{
                countMap.put(i, key);
            }
            // key++;
        }
System.out.println(countMap);
    }
}
