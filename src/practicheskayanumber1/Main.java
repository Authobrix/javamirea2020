package practicheskayanumber1;

import java.util.Arrays;

public class Main {
    // Подсчёт суммы (for, while, do while)
    public static void main(String[] args) {
        int sum = 0;
        int array[] = new int[]{1, 21, 312, 2};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        sum = 0;
        int w = 0;
        while (w != array.length) {
            sum = sum + array[w];
            w++;
        }
        System.out.println(sum);

        int d = 0;
        sum = 0;
        do {
            sum = sum + array[d];
            d++;
        } while (d != array.length);
        System.out.println(sum);

// Вывод аргументов командной строки
        for (int c = 0; c < args.length; c++) {
            System.out.println(args[c]);
        }

// Первые 10 чисел гармонического ряда
        double sum1 = 0.0;
        for (int i = 1; i < 10; i++) {
            sum1 = sum1 + (1.0 / i);
        }
        System.out.println(sum1);

// Массив рандомных чисел с сортировкой (другой метод в отдельном package)
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
// Нахождение факториала
        int factorial = 1;
        for (int i = 1; i < 5; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        // Другой метод в отдельной папке
    }
}


















