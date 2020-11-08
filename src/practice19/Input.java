package practice19;

import java.util.Scanner;

public class Input {
    public void method() {
        System.out.println("Введите ФИО и ИНН");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] parts = str.split(" ");
        char[] symb = parts[3].toCharArray();
        try {
            if (symb.length > 10 || symb.length < 10){
                throw (new Exception());
            }
            for (int i=0;i<symb.length;i++){
                if ((i == 0) && (symb[i]=='0')){
                    throw (new Exception());
                }
                if ((symb[i]<'0') && (symb[i]>'9')){
                    throw (new Exception());
                }
            }
            System.out.println("Верный ввод");
        } catch (Exception exe) {
            System.out.println("Неверный формат ИНН!");
        }
    }
}
