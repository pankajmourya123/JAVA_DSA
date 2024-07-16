package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anotherbasicmethods {
    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(2,4,1,5,6,7,8);

        List <Integer> sortedlst=list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlst);

        List<Integer> revlst=sortedlst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(revlst);

        //string 
        List<String> list2=Arrays.asList("pankaj","sarthak","vivek","ritik","shivam");
        List<String>  lststr=list2.stream().sorted().collect(Collectors.toList());
        System.out.println(lststr);

        List<String> revstr=lststr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(revstr);


        //anymatch//allmatch//nonematch

        HashSet<String> fruites=new HashSet<>();

        fruites.add("one apple");
        fruites.add("one mango");
        fruites.add("two apple");
        fruites.add("more  apple");
        fruites.add("two mango");

//anymatch return true if found any match or else false
        boolean res=fruites.stream().anyMatch(val->{return val.startsWith("one");});
        System.out.println(res);

        //return true if all elements match or false
        boolean res1=fruites.stream().allMatch(val->{return val.startsWith("one");});
        System.out.println(res1);

        //retur true if none of match
        boolean res3=fruites.stream().noneMatch(val->{return val.startsWith("one");});
        System.out.println(res3);

        //findany //findfirst

        Optional<String> strany=fruites.stream().findAny();

        System.out.println(strany.get());

        Optional<String> strfirst=fruites.stream().findFirst();

        System.out.println(strfirst.get());

        //concatinate of streams

        List<String> animals=Arrays.asList("Dog","Cat","cow");
        List<String> brids=Arrays.asList("crow","sparrow","piegeon");

        Stream <String> stream1=animals.stream();

        Stream <String> stream2=animals.stream();

        List<String> finaList=Stream.concat(stream1, stream2).collect(Collectors.toList());

        System.out.println(finaList);

    }
}
