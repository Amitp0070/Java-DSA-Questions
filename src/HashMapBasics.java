import java.lang.String;
import java.util.*;

public class HashMapBasics {


    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        // Insertion
        mapping.put("in","India");
        mapping.put("us","United States");
        mapping.put("up","Uttar Pradesh");

        System.out.println(mapping);

        Map<String, String> tables = new HashMap<>();
        tables.put("br", "Brazil");

        System.out.println("before" + tables);

        tables.putAll(mapping);
        System.out.println("After" + tables);

        // deletion
        tables.remove("br");
        System.out.println("After deletion" + tables);

        //Size
        System.out.println("Check Size: " + tables.size());

        //clear
//        tables.clear();
//        System.out.println("After clear " + tables.size());

//        tables.putIfAbsent("za", "Zapan");
//        tables.putIfAbsent("in", "india");
//        System.out.println(tables);


        System.out.println(tables.getOrDefault("is", "None"));
        System.out.println(tables.containsKey("in"));
        System.out.println(tables.containsValue( "India"));


        System.out.println(tables);
        tables.replace("in", "Bihar");
        System.out.println(tables);
        tables.replace("in", "Bihar", "india");
        System.out.println(tables);

//        System.out.println(tables.keySet());
        Set<String> keySet = tables.keySet();
        System.out.println(keySet);

        Collection<String> vlauseSet = tables.values();
        System.out.println(vlauseSet);

//        System.out.println(tables.entrySet());
        Set<Map.Entry<String, String>> st = tables.entrySet();
        System.out.println(st);


        // For loop on map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "two");
        for(Map.Entry<Integer, String> ab : map.entrySet()){
            System.out.println("Key: " + ab.getKey()+ ", Value: " + ab.getValue());
        }







    }
}
