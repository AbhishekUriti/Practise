package Basics;

import java.util.Arrays;

public class oddevensum {
    public static void main(String[] args) {
        int res[]=oddeven(new int[]{4,6,9,2,5});
        for(int i:res){
            System.out.print(i+" ");
        }

    }
    static int[] oddeven(int[] arr){
        int oddsum=0;
        int evensum=0;
        for (int  i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                evensum+=arr[i];
            if(arr[i]%2!=0)
                oddsum+=arr[i];
        }
        return new int[]{oddsum,evensum};
    }
}
