package practice7;

public class Main {
    public static void main(String[] args) {
        Pan kastrulya=new Pan("kastr1",10.0,15.4);
        Plate tarelka=new Plate("trlk1",2500);
        System.out.println(kastrulya.getName()+"  "+ kastrulya.getDiameter()+" "+kastrulya.height);
        System.out.println(tarelka.getName()+ "  " +tarelka.getcosts());
    }
}
