package practice26.prt2;

public class LinkedQueue extends AbstractQueue implements Queue {

    private Head head;
    private Head tail;

    protected void enqueueImpl(Object element) {
        Head key = tail;
        tail = new Head(element, null);
        if (size == 0) {
            head = tail;
        } else {
            key.next = tail;
        }
    }

    protected Object[] toArrayImpl(Object[] newElements) {
        newElements[0] = head.value;
        Head key = head.next;
        for(int i=1;i<size;i++) {
            newElements[i] = key.value;
            key = key.next;
        }
        return newElements;
    }

    protected void remove() {
        head = head.next;
    }

    protected Object elementImpl() {
        return head.value;
    }

    protected void clearImpl() {};

}