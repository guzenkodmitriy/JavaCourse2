package com.guzenko.test.collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "David");
        map.put(2345, "John");
        map.put(1254, "Mary");
        map.put(9548, "Katy");
        map.putIfAbsent(1255, "David");
        //map.put(5487, "Koba");
        System.out.println(map);
//        System.out.println(map.get(5555));
//        System.out.println(map.remove(1254));
        System.out.println(map.containsValue("David"));
        System.out.println(map.containsKey("2345"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
