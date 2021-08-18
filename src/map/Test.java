package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(3, "Three");
//        map.put(4, "One");
//        map.put(5, "Two");
//        map.put(6, "Three");
//        map.put(7, "One");
//        map.put(8, "Two");
//        map.put(9, "Three");
//        map.put(11, "One");
//        map.put(22, "Two");
//        map.put(33, "Three");
//        map.put(14, "One");
//        map.put(25, "Two");
//        map.put(36, "Three");

//        System.out.println(map);
//
//        map.put(3, "Other meaning");
//
//        System.out.println(map);
//
//        System.out.println(map.get(2));

//        for(Map.Entry<Integer, String> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        Map <Integer, String> treeMap = new TreeMap<>();

        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map){
        map.put(4, "Bob");
        map.put(34, "Mike");
        map.put(23, "Lisa");
        map.put(557, "Bartek");
        map.put(364, "Kuba");
        map.put(24, "Kamil");
        map.put(8, "Mihal");
        map.put(17, "Alex");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
