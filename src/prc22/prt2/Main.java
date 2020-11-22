package prc22.prt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: день, месяц, год");
        Date date = new Date(scanner.nextLine());
        System.out.println("Введите время: часы, минуты");
        Calendar calendar = new Calendar(scanner.nextLine());
        System.out.println(calendar.toString());
        System.out.println(date.toString());
    }
}