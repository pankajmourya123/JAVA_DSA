package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Hasmaptest {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 6, 6, 6, 6, 6 };

        // Count the occurrences of each number in the array using a HashMap
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Sort the numbers based on their occurrences in descending order
        List<Integer> sortedNums = new ArrayList<>(countMap.keySet());
        sortedNums.sort((a, b) -> countMap.get(b) - countMap.get(a));
        int[] array = sortedNums.stream().mapToInt(Integer::intValue).toArray();
        for (int i : array) {
            System.out.println(i);
        }
        // // // Create a new array based on the sorted numbers
        List<Integer> resultArr = new ArrayList<>();
        for (int num : sortedNums) {
            int count = countMap.get(num);
            for (int i = 0; i < count; i++) {
                resultArr.add(num);
            }
        }

        System.out.println(resultArr);
    }
}
