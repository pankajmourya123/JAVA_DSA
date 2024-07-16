package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
    int id;
    String sname;
    int roll_no;
   Student(int id
   ,String sname
   ,int roll_no){
    this.id=id;
    this.sname=sname;
    this.roll_no=roll_no;
   }
}

public class Flatmap {
 public static void main(String[] args) {
    // example 1
    // List<Integer> lst1=Arrays.asList(1,2);
    // List<Integer> lst2=Arrays.asList(2,3);
    // List<Integer> lst3=Arrays.asList(4,5);

    // List<List<Integer>> finalist=Arrays.asList(lst1,lst2,lst3);
    // List<Integer> res=finalist.stream().flatMap(n->n.stream().map(x->x*10)).collect(Collectors.toList());

    // System.out.println(res);

    //example 2
    List<String> lst1=Arrays.asList("pankaj ","sarthak");
    List<String> lst2=Arrays.asList("shivam","sawraj");
    List<String> lst3=Arrays.asList("harshal ","aayush");

    // without streams concepts

    // List<List<String>> finallst=new ArrayList<List<String>>();
    // finallst.add(lst1);
    // finallst.add(lst2);
    // finallst.add(lst3);

    // for (List<String> list : finallst) {
    //      for (String name : list) {
    //         System.out.print(name +" ");
    //      }
    // }

    //using streams flatMap()
    // List<String> names=finallst.stream().flatMap(x->x.stream()).collect(Collectors.toList());

    // System.out.print(names);

    List<Student> studentlst=new ArrayList<>();
    studentlst.add(new Student(1, "pankaj", 1));
    studentlst.add(new Student(12, "pankaj", 2));
    studentlst.add(new Student(13, "pankaj", 3));
   
    List<Student> studentlst2=new ArrayList<>();
    studentlst.add(new Student(1, "pankaj", 1));
    studentlst.add(new Student(12, "pankaj", 2));
    studentlst.add(new Student(13, "pankaj", 3));

    List<List<Student>> student =Arrays.asList(studentlst,studentlst2);

    // for (List <Student> s : student) {
    //     for (Student st : s) {
    //         System.out.println(st.sname);
    //     }
    // }

  List<String>nameslist=  student.stream().flatMap(sx->sx.stream()).map(s->s.sname).collect(Collectors.toList());

  System.out.println(nameslist);
 }   
}
