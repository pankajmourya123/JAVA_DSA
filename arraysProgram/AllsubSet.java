package arraysProgram;

import java.util.ArrayList;
import java.util.List;

public class AllsubSet {
    public static void main(String[] args) {
        int [] arr={1,2,3};
       List<List<Integer>> res = new ArrayList<>();
       findSubsets(arr,0,new ArrayList<>(),res);

       for (List<Integer> subset : res) {
        System.out.println(subset);
    }
    }

   static void findSubsets(int [] arr,int curr ,List<Integer>current , List<List<Integer>> res ){
  if(curr==arr.length){
    res.add(new ArrayList<>(current));
    return;
  }
  findSubsets(arr, curr+1, current, res);
  current.add(arr[curr]);
  findSubsets(arr, curr+1, current, res);
  current.remove(current.size() - 1);
    }
}
