package Basics;

public class Harshadnumber {
    public static void main(String[] args) {
        int number=18;
        int sumOfDigit=0;
        int temp=number;
        while (temp>0){
            sumOfDigit+=temp%10;
            temp/=10;
        }
        if(number%sumOfDigit==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
