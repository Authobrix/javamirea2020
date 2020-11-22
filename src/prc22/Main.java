package prc22;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату через пробел. Введите способ вывода: короткий, средний полный");
        Student student = new Student(scanner.nextLine());
        System.out.println(student.toString(scanner.nextLine()));
    }
}