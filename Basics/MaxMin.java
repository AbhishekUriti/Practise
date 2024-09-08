package Basics;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr={7,1,14,16,30,4};
        int minDifference = Integer.MAX_VALUE;
        for (int i=1;i<arr.length;i++){
            int difference=Math.abs(arr[i]-arr[i-1]);
            if(difference<minDifference){
                minDifference=difference;
            }
        }
        System.out.println(minDifference);
    }

}
