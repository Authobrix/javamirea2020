package prc20.part2;

public class Main {
    public static void main(String[] args) {

        String[] lines = {"String0", "String1", "String2", "String3", "String4", "String5"};
        Convers<String> listStr = new Convers(lines);
        listStr.showList();
        System.out.println(listStr.getByIndex(2));

    }
}
