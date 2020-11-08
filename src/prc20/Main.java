package prc20;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        cnvrt<Integer> listInt = new cnvrt(numbers);
        listInt.showList();
    }
}