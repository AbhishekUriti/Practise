package Arrays1;

import java.util.Arrays;

public class pairs {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=1;
        System.out.println(pairs(arr,k));
    }
    private static boolean binarySearch(int[] arr,int NumberToFind){
        int left=0,right=arr.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==NumberToFind) return true;
            if(arr[mid]<NumberToFind) left=mid+1;
            else right=mid-1;
        }
        return false;
    }
    public static int pairs(int[] arr,int k){
        Arrays.sort(arr);
        int result=0;
        for(int i:arr){
            int numberToSearch=i-k;
            if(binarySearch(arr,numberToSearch))
                result++;
        }
        return result;
    }
}
