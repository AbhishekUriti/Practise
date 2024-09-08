package Basics;

import java.util.ArrayList;
import java.util.List;

public class firstLast {
    public static void main(String[] args) {
        int[] nums={1,3,5,7,9,11,3,13,15,3};
        int firstindex=-1;
        int lastindex=-1;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==3){
               if(firstindex==-1)
                   firstindex=i;
               lastindex=i;
            }
        }
        System.out.println(firstindex+" "+lastindex);
        System.out.println(findIndex(nums));
    }
    static List<Integer> findIndex(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if(arr[i]==3)
                list.add(i);
        }
        return list;
    }
}
