package prc20.part3;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Convers<Integer> listInt = new Convers(numbers);
        listInt.showList();
        String[] lines = {"String0", "String1", "String2", "String3", "String4", "String5"};
        Convers<String> listStr = new Convers(lines);
        listStr.showFive();
    }
}