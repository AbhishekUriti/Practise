package Basics;

public class BalancedSubstring {
    public static void main(String[] args) {
        String res="LRRLLLLRRLRR";
        int countL=0;
        int countR=0;
        int balancedCount=0;
        for (char c:res.toCharArray()){
            if(c=='L'){
                countL++;
            }
            if(c=='R'){
                countR++;
            }

            if(countL==countR){
                balancedCount++;
                countL=0;
                countR=0;
            }
        }
        System.out.println(balancedCount);
    }
}
