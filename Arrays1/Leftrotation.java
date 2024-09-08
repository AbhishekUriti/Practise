package Arrays1;

import java.util.Arrays;

public class Leftrotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotateLeft(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateLeft(int[] arr,int k){
        k%=arr.length;
        int[] temp=new int[k];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }

        for(int i=0;i<arr.length-k;i++){
            arr[i]=arr[i+k];
        }

        for(int i=arr.length-k;i<arr.length;i++){
            arr[i]=temp[i-k-1];
        }
    }
}
