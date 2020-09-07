package Random;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int min = 100;
        int max = 200;
        int diff = max - min;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int f = random.nextInt(diff + 1);
            f += min;
            arr[i] = f;
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }



    }
}


