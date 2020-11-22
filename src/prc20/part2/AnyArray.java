package prc20.part2;

public class AnyArray <E> {
    private E[] arr;

    public E getArrIndex(int i) {
        return arr[i];
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getLength() {
        return arr.length;
    }

    public static <E> void sid(String s, E[] arr) {

        E[] a = arr;
        AnyArray<E> sid = new AnyArray<E>();
        sid.setArr(a);

        System.out.print(s + "  ");

        for (int i = 0; i < sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i) + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        String[] s = {"Hello", "World", "!"};
        sid("String", s);

        Integer[] chisla = {1, 2, 3, 4, 5, 6, 7, 8};
        sid("Integer", chisla);

        Double[] drob = {1.2, 1.5, 6.7};
        sid("Double", drob);
    }
}

