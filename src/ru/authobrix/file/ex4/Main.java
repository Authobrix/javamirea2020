package ru.authobrix.file.ex4;

public class Main {
    public static void main(String[] args) {

        int [] array;
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*47);
            System.out.println(array[i]);

        }

    }
}
