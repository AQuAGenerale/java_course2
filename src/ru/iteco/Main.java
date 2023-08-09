package ru.iteco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        int[] digits = new int[5];
        String entrance;
        int spaceIndex = 0;
        Scanner scn = new Scanner(System.in);
        entrance = scn.nextLine();

        String[] array = entrance.split("");
        for (int i = 0; !array[i].equals(" "); i++) {
            name.append(array[i]);
            if (array[i+1].equals(" ")) {
                spaceIndex = i + 1;
            }
        }
        if (array.length - spaceIndex > 6 || array.length - spaceIndex < 3) {
            System.out.println("Введите число с разрядностью от 2 до 5 в слеующий раз");
            System.exit(0);
        }
        System.out.println(name);
         for (int i = spaceIndex + 1; i < array.length; i++) {
            digits[i - spaceIndex - 1] = Integer.parseInt(array[i]);
        }
        System.out.println(countSumConverted(String.valueOf(name), digits));
    }

    public static int sumOfDigits(int[] digits, int n) {
        if (n == 0)
            return digits[n];
        else
            return digits[n] + sumOfDigits(digits, n-1);
    }

    public static String countSumConverted (String name, int[] digits) {
        return ("Здравствуй, " + name  + "! Сумма цифр в числе = " + converter(sumOfDigits(digits, digits.length - 1)));
    }
    public static String converter (int sumOfDigits) {
        switch (sumOfDigits) {
            case 0:
                return "нулю";
            case 1:
                return "одному";
            case 2:
                return "двум";
            case 3:
                return "трем";
            case 4:
                return "четырем";
            case 5:
                return "пяти";
            case 6:
                return "шести";
            case 7:
                return "семи";
            case 8:
                return "восьми";
            case 9:
                return "девяти";
            case 10:
                return "десяти";
        }
        return "больше 10, что противоречит условию простоты реализации конвертера";
    }
}