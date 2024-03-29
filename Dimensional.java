package com.trimindtech.training.home02;

public class Dimensional {
    public static void main(String[] args) {
        int[][] a = {{15, 25, 35}, {45, 55, 65}};
        int[][] b = {{12, 22, 32}, {55, 25, 85}};
        int[][] Sum = new int[2][3];
        int rows, columns;

        for (rows = 0; rows < a.length; rows++) {
            for (columns = 0; columns < a[0].length; columns++) {
                Sum[rows][columns] = a[rows][columns] + b[rows][columns];
            }
        }
        System.out.println("Sum of two arrays are: ");
        for (rows = 0; rows < a.length; rows++) {
            for (columns = 0; columns < a[0].length; columns++) {
                System.out.format("%d \t", Sum[rows][columns]);
            }
            System.out.println("");
        }
    }
}