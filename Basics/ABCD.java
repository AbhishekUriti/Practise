package Basics;

import java.util.Stack;

public class ABCD {
    public static void main(String[] args) {
        String str="CCAAABBBDE";
        Stack<Character> stack=new Stack<>();
        for (char ch:str.toCharArray()){
            if(!stack.isEmpty() &&((stack.peek()=='A' && ch=='B')||(stack.peek()=='C'&&ch=='D'))){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        System.out.println(stack.size());
    }
}
