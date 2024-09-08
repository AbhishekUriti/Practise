package Basics;

public class numberdistribution {
    public static void main(String[] args) {
        int[] arr={120,0,-9,89,68,-982,91,-54,-12,-139};
        int zero=0;
        int positive=0;
        int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                positive++;
            if(arr[i]<0)
                negative++;
            if(arr[i]==0)
                zero++;
        }
        System.out.println(zero+" "+positive+" "+negative);

    }
}
