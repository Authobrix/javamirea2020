package prc19part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иванов", 24, 123456),
                new Student("Петров", 20, 234567),
                new Student("Сидоров", 22, 345678),
        };
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int id = scanner.nextInt();
        Student student = new Student(name, age, id);
        try {
            if (!Search(students, student)) {
                throw (new Exception());
            } else {
                System.out.println("Found");
            }
        } catch (Exception exe) {
            System.out.println("Not found");
        }
    }
    public static boolean Search(Student[] students, Student student) {
        for (Student student1 : students) {
            if (student1.compareTo(student)) {
                return true;
            }
        }
        return false;
    }
}