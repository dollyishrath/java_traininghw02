package com.trimindtech.training.home02;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        i = sc.nextInt();
        sum=sum+1;
        if(i<=5 ){
            System.out.println("natural number");
        }
        else{
            System.out.println("not a natural number");
        }
    }
}
