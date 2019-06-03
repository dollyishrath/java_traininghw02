package com.trimindtech.training.home02;

public class Array {
    public static void main(String[] args) {
        int[] arr = {10,20,15,25,30};
        int sum=0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("sum of array values:" + sum);

    }
}

