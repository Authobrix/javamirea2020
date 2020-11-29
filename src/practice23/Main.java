package practice23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Nolan", "Christopher");
        map.put("Tarantino","Quentin");
        map.put("Scott","Ridley");
        map.put("Spielberg","Steven");
        map.put("Mcdonagh","Martin");
        map.put("Anderson","Wes");
        map.put("Reeves","Matt");
        map.put("Scorsese", "Martin");
        map.put("Snyder","Zack");
        map.put("Fincher","David");
        map.put("Lynch","David");

        Map<String, String> NewMap = new HashMap<>();
        for (Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            String value = map.get(key);
            if (!NewMap.containsValue(value))
                NewMap.put(key, value);
        }
        System.out.println(NewMap);
    }
}