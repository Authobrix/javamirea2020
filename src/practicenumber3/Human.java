package practicenumber3;

public class Human {

    public static void main(String[] args) {

        Hand hand = new Hand(58);
        Head head = new Head("brown",3);
        Leg leg = new Leg(44);

        System.out.println(hand.toString());
        System.out.println(head.toString());
        System.out.println(leg.toString());

    }
}
