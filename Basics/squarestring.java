package Basics;

public class squarestring {
    public static void main(String[] args) {
        String str="aabaabaabaab";
        int length=str.length();
        if(length%2==0){
            String firstHalf=str.substring(0,length/2);
            String secondHalf=str.substring(length/2);

            if(firstHalf.equals(secondHalf)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }else {
            System.out.println("No");
        }
    }

}
