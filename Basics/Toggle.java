package Basics;

public class Toggle {
    public static void main(String[] args) {
        String str="sMaRtInTeRvIeWs";
        String res="";
        for (char c:str.toCharArray()){
            if(Character.isLowerCase(c)){
                res+=Character.toUpperCase(c);
            }else {
                res+=Character.toLowerCase(c);
            }
        }
        System.out.println(res);
    }
}
