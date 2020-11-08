package prc20.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convers<E> {
    private List<E> list = new ArrayList<>();
    public Convers(E[] arr) {
        list.addAll(Arrays.asList(arr));
    }
    public void showList() {
        for (Object ls : list) {
            System.out.println(ls);
        }
    }
    public E getByIndex(int index){
        return list.get(index);
    }
    public void add(E element) {
        list.add(element);
    }
    public List getList() {
        return list;
    }
}
