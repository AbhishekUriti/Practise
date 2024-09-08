package Basics;

public class vowelsandconsonants {
    public static void main(String[] args) {
        String str="abxbbiAaspw";
        String vowels="aeiouAEIOU";
        int vow=0;
        int con=0;
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(vowels.indexOf(c)!=-1){
                vow++;
            } else if (Character.isLetter(c)) {
                con++;
            }
        }
        System.out.println(vow+" "+con);
    }
}
