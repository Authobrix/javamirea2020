package prc22.prt3;

   import java.util.Date;
   import java.util.Scanner;

    public class Main{
        public  static void main(String[] args) {
            DevInf devInf = new DevInf();
            String surname = devInf.InputFio();
            System.out.println("Developers Surname is " + surname);
            devInf.getDateOfBeginTask();
            devInf.getDateOfFinishTask();
        }
    }