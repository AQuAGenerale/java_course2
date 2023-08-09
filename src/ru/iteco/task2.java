package ru.iteco;

import java.util.Scanner;

public class task2 {
}


/*

int[][] array = new int[4][3];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) System.out.print(array[i][j] + "\n");
                else {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println("\n" + "Task 1." + "\n" + "Sum of elements in rows.");
        for (int i = 0; i < 4; i++) {
            int row = i + 1;
            int sumOfRow = 0;
            for (int j = 0; j < 3; j++){
                sumOfRow = sumOfRow + array[i][j];
            }
            System.out.println("Line " + row + ": " + sumOfRow);
        }

        System.out.println("\n" + "Task 2." + "\n" + "Sum of elements in columns.");
        for (int j = 0; j < 3; j++) {
            int sumOfCol = 0;
            int col = 0;
            for (int i = 0; i < 4; i++){
                col = j + 1;
                sumOfCol = sumOfCol + array[i][j];
            }
            System.out.println("Column " + col + ": " + sumOfCol);
        }

        System.out.println("\n" + "Task 3." + "\n" + "0/1 changes.");
        int[][] array2 = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                array2[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ( array2[i][j] % 2 == 1) {
                    array2[i][j] = 1;
                } else {
                    array2[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) System.out.print(array2[i][j] + "\n");
                else {
                    System.out.print(array2[i][j] + " ");
                }
            }
        }


        System.out.println("\n" + "Task 4." + "\n" + "Arithmetic mean.");
        for (int i = 0; i < 4; i++) {
            int row = i + 1;
            int sumOfRow = 0;
            for (int j = 0; j < 3; j++){
                sumOfRow = sumOfRow + array[i][j];
            }
            System.out.println("Line " + row + " average: " + sumOfRow / 3);
        }

        System.out.println("\n" + "Task 5." + "\n" + "Reversal 1D massive.");
        int [] myArray = new int[12];
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                myArray[counter] = array[i][j];
                counter++;
            }
        }
        int base;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray.length == 1) {
                System.out.println(myArray[0]);
            }
            if (myArray.length / 2 >= i + 1) {
                base = myArray[myArray.length - 1 - i];
                myArray[myArray.length - 1 - i] =  myArray[i];
                myArray[i] = base;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (i + 1 == myArray.length) {
                System.out.print (myArray[i]);
            } else {
                System.out.print (myArray[i] + " ");
            }
        }
    }
}

   /* String digits = "";
       for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 0) {
        digits = digits + array[i] + " ";
        }
        }*/
