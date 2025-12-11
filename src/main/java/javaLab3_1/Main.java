package javaLab3_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Программа для выполнения простых операций калькулятора и поиска максимального элемента массива.
 *
 * @author Anton Fedyaev
 * @version 2.0
 * @since 07.12.2025
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        int maxNegative = -11;
        int minPositive = 11;
        int maxNegativeNumber=0;
        int minPositiveNumber=0;
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) - 10;
            System.out.println("arr[" + i + "]" + arr[i]);
            if (arr[i] > 0 && arr[i] < minPositive) {
                minPositive = arr[i];
                maxNegativeNumber=i;
                continue;
            }

            if (arr[i] < 0 && arr[i] > maxNegative) {
                maxNegative = arr[i];
                minPositiveNumber=i;

            }

        }
        System.out.println();

        if (maxNegative == -11 || minPositive == 11) {
            System.out.println("Положительные или отрицательные элементы не найдены");

        }

        else {
            arr[maxNegativeNumber]=maxNegative;
            arr[minPositiveNumber]=minPositive;
            System.out.println("Новый массив, местами поменялись элементы "+maxNegativeNumber+" и "+minPositiveNumber+":");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr[" + i + "]" + arr[i]);

            }
        }


    }
}
