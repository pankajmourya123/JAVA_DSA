package collectionsFramework;

import java.util.Comparator;
import java.util.TreeSet;

// public class Coparatortest {
//     public static void main(String[] args) {
//         //Alphabetical order;
//         TreeSet ts=new TreeSet<>(new MyComparator());
//         ts.add(new StringBuffer("A"));
//         ts.add(new StringBuffer("Z"));
//         ts.add(new StringBuffer("K"));
//         ts.add(new StringBuffer("L"));
//         System.out.println(ts);
//     }
// }

// class MyComparator implements Comparator{
//        public int compare(Object obj1,Object obj2){
//        String s1=obj1.toString();
//        String s2=obj2.toString();
//        return s1.compareTo(s2);

//        }
// }


// public class Coparatortest {
//     public static void main(String[] args) {
//         //Alphabetical order;
//         TreeSet ts=new TreeSet<>(new MyComparator());
//         ts.add(90);
//         ts.add(9);
//         ts.add(8);
//         ts.add(3);
//         System.out.println(ts);
//     }
// }

// class MyComparator implements Comparator{
//        public int compare(Object obj1,Object obj2){
//       Integer s1=(Integer)obj1;
//      Integer s2=(Integer)obj2;
//        if (s1<s2) {
//         return +1;
//        }
//        else if(s1<s2){
//    return -1;
//        }
//        else{
//         return 0;
//        }

//        }
// }



// public class Coparatortest {
//     public static void main(String[] args) {
//         //Alphabetical order;
//         TreeSet ts=new TreeSet<>(new MyComparator());
//         ts.add(90);
//         ts.add(9);
//         ts.add(8);
//         ts.add(3);
//         System.out.println(ts);
//     }
// }

// class MyComparator implements Comparator{
//        public int compare(Object obj1,Object obj2){
//       Integer s1=(Integer)obj1;
//      Integer s2=(Integer)obj2;
//        if (s1<s2) {
//         return +1;
//        }
//        else if(s1<s2){
//    return -1;
//        }
//        else{
//         return 0;
//        }

//        }
// }




// public class Coparatortest {
//     public static void main(String[] args) {
//         //Alphabetical order;
//         TreeSet ts=new TreeSet<>(new MyComparator());
//         ts.add("Roja");
//         ts.add("sobha rani");
//         ts.add("ganga bhavani");
//         ts.add("rrrrrrrr");
//         System.out.println(ts);
//     }
// }

// class MyComparator implements Comparator{
//        public int compare(Object obj1,Object obj2){
//        String s1=obj1.toString();
//        String s2=obj2.toString();
//         // s1.compareTo(s2);
//         return -1;
       


//        }
// }



public class Coparatortest {
    public static void main(String[] args) {
        //Alphabetical order;
        TreeSet ts=new TreeSet<>(new MyComparator());
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("AA"));
        ts.add(new StringBuffer("Kkk"));
        ts.add(new StringBuffer("LLLL"));
        System.out.println(ts);
    }
}

class MyComparator implements Comparator{
       public int compare(Object obj1,Object obj2){
       String s1=obj1.toString();
       String s2=obj2.toString();
       int l1=s1.length();
       int l2=s2.length();
       if (l1<l2) {
            return  -1;
       }
       else if(l1>l2){
        return +1;
       }
else{
    return s1.compareTo(s2);
}

       }
}