package com.khiemnd5.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by khiemnd5 on 9/29/17.
 */
public class ForEachJava8 {
    public void printMap() {
        Map<String, Integer> map  =  new HashMap<String, Integer>();
        map.put("A", 1);
        map.put("B", 4);
        map.put("C", 5);
        map.put("D", 2);
        map.put("E", 9);

        // normal
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            if ("D".equals(entry.getKey())) {
                System.out.println("Hello D" + entry.getValue());
            }
        }

        // lambada
        map.forEach((k, v) -> {
            if ("E".equals(k)) {
                System.out.println("Hello E: "+ v);
            }
        } );
    }

    public void printList() {
        List<String> list = new ArrayList<>();
        list.add("Khiem");
        list.add("Khiem 1");
        list.add("Khiem 2");
        list.add("Khiem 3");
        list.add("Khiem 4");

        // normal
        for (String item : list) {
            System.out.println(item);
        }

        //java 8
        list.forEach(item -> System.out.println(item));
        list.forEach(item -> {
            if ("Khiem".equals(item)){
                System.out.println(item);
            }
        });
    }

    public static void main(String[] args) {
        ForEachJava8 forEachJava8 = new ForEachJava8();
//        forEachJava8.printMap();
        forEachJava8.printList();
        forEachJava8.printList();
    }


}


