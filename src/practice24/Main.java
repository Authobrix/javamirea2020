package practice24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.nextLine());
        System.out.println(person.fio());
    }
}