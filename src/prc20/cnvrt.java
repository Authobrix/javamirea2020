package prc20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cnvrt<E> {
    private List<E> list = new ArrayList<>();
    public cnvrt(E[] arr) {
        list.addAll(Arrays.asList(arr));
    }
    public void showList() {
        for (Object ls : list) {
            System.out.println(ls);
        }
    }
    public void add(E element) {
        list.add(element);
    }
    public List getList() {
        return list;
    }
}