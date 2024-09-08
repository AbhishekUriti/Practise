package Basics;

public class DigitString {
    public static void main(String[] args) {
        String str="123456786543";
        if(str.matches("\\d+")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
