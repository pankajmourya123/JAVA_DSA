package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import collectionsFramework.sortset;

class parallemstream{
    public static void main(String[] args) {
       int [] nums = {-4,-1,0,3,10};
       int [] res=new int[nums.length];
       int min=Integer.MIN_VALUE;
    for (int i = 0; i <nums.length; i++) {
        res[i]=nums[i]*nums[i];
        //here i want sort res
        if(min>res[i]){
                int temp=min;
                min=res[i];
                res[i]=temp;
        }
    }

  System.out.println(Arrays.toString(res));
    }
}