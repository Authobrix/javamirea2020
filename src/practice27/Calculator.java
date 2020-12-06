package practice27;

public class Calculator {
    public static void main(String[] args) {
        CalcModel clc = new CalcModel();
        CalcContr theController = new CalcContr(clc);
    }
}