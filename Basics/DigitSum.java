package Basics;

public class DigitSum {
    public static void main(String[] args) {
        int number=164;
        int result=0;
        while (number!=0){
            int digit=number%10;
            result=result+digit;
            number=number/10;
        }
        System.out.println(result);
    }
}
