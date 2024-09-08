package Basics;

public class MinDigit {
    public static void main(String[] args) {
        String N="132";
        char minDigit=N.charAt(0);
        for (int i=1;i<N.length();i++){
            if(N.charAt(i)<minDigit){
                minDigit=N.charAt(i);
            }
        }
        System.out.println(minDigit);
    }
}
