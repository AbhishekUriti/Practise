package Basics;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
     int arr[]={1,1,5,8,10,12,15};
     int brr[]={-1,2,4,5,7};
     int res[]=new int[arr.length+brr.length];
     int i=0,j=0,k=0;
     while (i<arr.length && j< brr.length){
         if(arr[i]<=brr[j])
             res[k++]=arr[i++];
         else
             res[k++]=brr[j++];
     }
     while (i<arr.length){
         res[k++]=arr[i++];
     }
     while (j<brr.length){
         res[k++]=brr[j++];
     }
        System.out.println(Arrays.toString(res));
    }
}
