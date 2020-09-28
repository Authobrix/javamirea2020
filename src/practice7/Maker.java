package practice7;

public class Maker {
    public static void main(String[] args) {
        Table stol = new Table("Wood", 3.75);
        Chair stul = new Chair(4, 400);
        System.out.println(stol.getMaterial()+" "+stol.getSquare());
        System.out.println(stul.getCountOfLegs()+" "+ stul.getCosts());
    }
}
