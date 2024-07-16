
// Problem Statement:
// You are given an integer 
// n. You need to find and print all possible subsets of the set 
// {1,2,3,…,n}.
package Recursion;

import java.util.ArrayList;

public class Nsubset {
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
 

    public static void findSubsets(int n, ArrayList<Integer> subset) {
       if(n == 0) {
           printSubsets(subset);
           return;
       }

      //add kiya
       findSubsets(n-1, subset);
       subset.add(n);
       //add nahi kiya
       findSubsets(n-1, subset);
       subset.remove(subset.size() - 1);
   }


   public static void main(String args[]) {
       int n = 3;
       findSubsets(n, new ArrayList<Integer> ());
   }

}
