package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Linearsearch {
    public static void main(String[] args) {
        int [] arr={1,4,2};
        int tar=4;
    //    System.out.println( linearsr(arr,tar,0));
    //    System.out.println( isPresent( arr, 0, tar ));
    // System.out.println(linearsearchlast(arr,tar,arr.length-1));
        //    ArrayList<Integer> list = new ArrayList<>();
        // findAllIndex(arr, 4, 0);
        findAllIndex2( arr,  4, 0);
    //    System.out.println(ans);
    //    System.out.println(list);
    }
    public static int linearsr(int[] arr,int tar,int idx){
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == tar) {
            return idx;
        } else {
            return linearsr(arr, tar, idx + 1);
        }
    }


    public static boolean isPresent(int[] arr,int idx,int tar ){
        if(idx==arr.length){
            return false;
        }

        if (arr[idx]==tar) {
            return true;
        } 
        return isPresent(arr, idx+1, tar);
    }

    public static int linearsearchlast(int []arr,int tar,int idx){
        if(idx<0){
            return -1;
        }

        if(arr[idx]==tar){
            return idx;
        }

        return linearsearchlast(arr, tar, idx-1);
    }


     static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            // list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            // list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
    
}
