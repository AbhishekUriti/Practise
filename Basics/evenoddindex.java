package Basics;

public class evenoddindex {
    public static void main(String[] args) {
        String str="afdg5tg";
        StringBuilder oddchars=new StringBuilder();
        StringBuilder evenchars=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if(i%2==0){
                evenchars.append(str.charAt(i));
            }else {
                oddchars.append(str.charAt(i));
            }
        }
        String result=oddchars.toString()+evenchars.toString();
        System.out.println(result);
    }
}
