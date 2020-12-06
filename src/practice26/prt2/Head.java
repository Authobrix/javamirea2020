package practice26.prt2;

public class Head {
    Object value;
    Head next;
    public Head(Object value, Head next) {
        assert value != null;
        this.value = value;
        this.next = next;
    }
}