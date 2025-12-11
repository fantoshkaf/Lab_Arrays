package javaLab3_1;

import java.util.Random;

/**
 * Программа генерирует массив из 20 целых числе в диапазоне от -10 до 10
 * Затем находит максимальный отрицательный и минимальный положительный элементы массива
 * После чего меняет их местами
 *
 * @author Anton Fedyaev
 * @version 2.0
 * @since 07.12.2025
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        //-11 и 11 не могут попасть в массив
        int maxNegative = -11;// максимальный отрицательный
        int minPositive = 11;// минимальный положительный
        int maxNegativeNumber = -1;// номер максимального отрицательного
        int minPositiveNumber = -1;// номер минимального положительного
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) - 10;// от -10 до 10 включительно
            System.out.println("arr[" + i + "]" + arr[i]);

            // поиск минимального положительного
            if (arr[i] > 0 && arr[i] < minPositive) {
                minPositive = arr[i];
                maxNegativeNumber = i;
                continue;
            }

            // поиск максималного отрицательного
            if (arr[i] < 0 && arr[i] > maxNegative) {
                maxNegative = arr[i];
                minPositiveNumber = i;

            }

        }

        System.out.println();// пустая строка для красоты


        // проверка, что нужные элементы найдены
        if (maxNegative == -11 || minPositive == 11) {
            System.out.println("Положительные или отрицательные элементы не найдены");

        } else {
            // элементы меняются местами
            arr[maxNegativeNumber] = maxNegative;
            arr[minPositiveNumber] = minPositive;
            System.out.println("Новый массив, местами поменялись элементы " + maxNegativeNumber + " и " + minPositiveNumber + ":");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr[" + i + "]" + arr[i]);

            }
        }


    }
}
