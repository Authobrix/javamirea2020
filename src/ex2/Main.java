package ex2;

public class Main {

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
        }


        while (d != array.length);
        System.out.println(sum);


        for (int c = 0; c < args.length; c++) {
            System.out.println(args[c]);
        }


        double sum1 = 0.0;
        for (int i = 1; i < 10; i++) {
            sum1 = sum1 + (1.0 / i);
        }
            System.out.println(sum1);
        int [] arr;
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*47);
            System.out.println(array[i]);

        }

    }
}









