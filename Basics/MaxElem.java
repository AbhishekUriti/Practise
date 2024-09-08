package Basics;

import java.util.Scanner;

public class MaxElem {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}
