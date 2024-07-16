package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class maptesting {
    public static void main(String[] args) {
    //     ArrayList<String> l=new ArrayList<String>();
    //     l.add("pankaj");
    //     l.add("pankaj");
    //     l.add("pankaj");
    //     l.add("pankaj");
    //     l.add("pankaj");
    //   List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    //           System.out.println(l2);
              ArrayList<Integer> l3=new ArrayList<>();
              l3.add(90);
              l3.add(90);
              l3.add(90);
              l3.add(90);
              l3.add(90);
              l3.add(90);
              l3.add(90);

              for (Integer i : l3) {
                System.out.println(i);
          }
Integer [] arr=l3.stream().toArray(Integer[]::new);
for (Integer i : arr) {
    System.out.println(i);
}
    System.out.println(arr.length);


    int[] arr2={30,50,60,70,75,78};
    Stream s= Stream.of(arr2);
    
    }
}
