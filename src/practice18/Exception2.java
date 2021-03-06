package practice18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            if (2.0/i!=Double.POSITIVE_INFINITY) {
                System.out.println(2.0/i);
            }
            else {
                System.out.println("Бесконечность, на 0 делить нельзя");
            }
        } catch (Exception ex) {
            ex.getMessage();
            System.out.println("Нельзя делить на 0");
        } finally {
            System.out.println("Finish");
        }
    }
}