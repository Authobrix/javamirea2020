package practice23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Christopher","Nolan");
        map.put("Quentin","Tarantino");
        map.put("Ridley","Scott");
        map.put("Steven","Spielberg");
        map.put("Martin","Mcdonagh");
        map.put("Wes","Anderson");
        map.put("Matt","Reeves");
        map.put("Martin","Scorsese");
        map.put("Zack","Snyder");
        map.put("David","Fincher");
        map.put("David", "Lynch");

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