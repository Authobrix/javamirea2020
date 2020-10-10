package practice10;

public class fifteen {
    public static void main(String []args) {
        System.out.println(recursion(321));
    }
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
}
