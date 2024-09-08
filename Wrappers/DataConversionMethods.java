package Wrappers;

public class DataConversionMethods {
    public static void main(String[] args) {
//        String s1="123";
//        String s2="456";
//        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
//        System.out.println(s1.getClass().getName());
        String s1="10.5";
        String s2="20.0";
        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));

        int a=10;
        double d=10.5;
        char c='A';
        boolean bool=true;
        System.out.println(String.valueOf(a).getClass().getName());
    }
}
