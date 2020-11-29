package practice23.prt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Будённовск");
        arrayList.add("Москва");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Вашингтон");
        arrayList1.add("Чикаго");
        map.put("Россия", arrayList);
        map.put("США",arrayList1);
        System.out.println(map.get("США"));
    }
}