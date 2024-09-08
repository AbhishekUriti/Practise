package Basics;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("smartinterviews","viewsintersmart"));
    }
    static boolean anagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");
        int counts[]=new int[26];
        for (int i=0;i<str1.length();i++){
            counts[str1.charAt(i)-'a']++;
        }
        for (int i=0;i<str2.length();i++){
            counts[str2.charAt(i)-'a']--;
        }
        for (int count:counts){
            if(count!=0)
                return false;
        }
        return true;
    }
}
