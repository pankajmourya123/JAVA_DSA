package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Basicmethods {
    public static void main(String[] args) {

         List<Integer> numberList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

         long numofeven=numberList.stream().filter(num->num %2==0).count();
        //  System.out.println(numofeven);

         //min
 Optional <Integer> min=numberList.stream().min((val1,val2)->{
            return val1.compareTo(val2);
         });
// System.out.println(min);
    //max
Optional <Integer> max=numberList.stream().max((val1,val2)->{
    return val1.compareTo(val2);
});

// System.out.println(max);

// distict
long uniqune=numberList.stream().filter(x->x%2==0).distinct().count();
// System.out.println(uniqune);

// Reduce 
List<String> stringlist=Arrays.asList("A","B","C","1","2","3");

List<Integer> number=Arrays.asList(1,2,3,4,5);

Optional <Integer> reduced=number.stream().reduce((value,combinedvalue)->{
    return combinedvalue+value;
});

// System.out.println(reduced.get());

//toArray

List<Integer> str=Arrays.asList(1,2,3,4,5,6,7);
int arr[]=str.stream().mapToInt(Integer::intValue).toArray();

// System.out.println(arr);

//limit

List<Integer> arr1=Arrays.asList(1,2,3,4,5,6,7);

List <Integer> res =arr1.stream().limit(3).collect(Collectors.toList());

System.out.println(res);


    }
}
