package practice25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ip {

    public static void main(String[] args) {
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
        System.out.println("Введите IP адреса");
        Scanner in = new Scanner(System.in);
        String goodIp = in.nextLine();
        if (goodIp.matches(regex)) {
            System.out.println("IP адрес верный");
        }
        else {
            System.out.println("IP адрес неверный");
        }
    }
}
