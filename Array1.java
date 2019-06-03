package com.trimindtech.training.home02;

public class Array1 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false;

        for (int n : num) { //to iterate every element in array
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + "is found");
        else
            System.out.println(toFind + "is not found");
    }
}
