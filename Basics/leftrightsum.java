package Basics;

import java.util.ArrayList;
import java.util.List;

public class leftrightsum {
    public static void main(String[] args) {
       List<Integer> list=new ArrayList<>();
       int[] nums={6,7,7};
       for (int i=0;i<nums.length;i++){
           int leftSum=0;
           int rightSum=0;
           for (int j=0;j<i;j++){
               leftSum+=nums[j];
           }
           for (int j=i+1;j<nums.length;j++){
               rightSum+=nums[j];
           }
           int difference=Math.abs(leftSum-rightSum);
           list.add(difference);
       }
       for (int i=0;i<list.size();i++){
           System.out.print(list.get(i)+" ");
       }
    }

}
