package com.trimindtech.training.home02;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int i,j,s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower limit");
        s1 = sc.nextInt();
        System.out.println("enter the upper limit");
        s2 = sc.nextInt();
        System.out.println("the number is in between the entered numbers");
        for(i=s1;i<=s2;i++)
        {
            System.out.println("print a number");
        }
        for(j=1;j<i;j++)
        {
            System.out.println("doesnot print a number");
        }
    }
}
