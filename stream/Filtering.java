package stream;

import java.util.ArrayList;
import java.util.List; 
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        
        System.out.println(list2);
    }
}
