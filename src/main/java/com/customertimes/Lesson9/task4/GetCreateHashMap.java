package com.customertimes.Lesson9.task4;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class GetCreateHashMap {
    public static String a = "Spider Man";
    public static String b = "Films";

    public static void main(String[] args) {
        getHashMap();
    }

    public static void getHashMap() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Games", "Dota");
        hashMap.put("Games", "CS");
        hashMap.put("Films", "Titanic");
        hashMap.put("Comics", "Spider Man");
        hashMap.put("Books", "Alphabetic");
        hashMap.put("Heroes", "Spider Man");
        hashMap.put("King", "Arthur");
        hashMap.put("Drink", "Cofee");
        hashMap.put("Food", "Pizza");
        hashMap.put("Phone", "Iphone");

        System.out.println(hashMap);
        System.out.println("For key \""+b+"\""+" value = "+hashMap.get(b));

        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = it.next();
            if (pair.getValue() == a) {
                System.out.println("For value \"" + pair.getValue() + "\"- Key = " + pair.getKey());
            }
            it.remove();
        }
        }
    }

