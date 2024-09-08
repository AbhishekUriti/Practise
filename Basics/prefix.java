package Basics;

import java.util.Arrays;

public class prefix {
    public static void main(String[] args) {
        String str="smartinterviewssmart smart";
        String []words=str.split(" ");
        String S=words[0];
        String T=words[1];
        if(S.startsWith(T) && S.endsWith(T)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(StringRotation("hello lohel"));
    }
    static String StringRotation(String str){
        String[] parts=str.split(" ");
        String A=parts[0];
        String B=parts[1];
        if(A.length()==B.length()&&(B+B).contains(A)){
            return "Yes";
        }else {
            return "No";
        }
    }
}
