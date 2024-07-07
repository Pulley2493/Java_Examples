package com.summer.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Map {
    public static void main(String args[]){
        java.util.Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1,2);
        map.put(2,3);
        map.put(4,5);
        map.put(3,4);
        map.put(4,5);
        map.put(1,2);

        map.remove(3);
        System.out.println(map);
        System.out.println(map.get(2));

        Iterator iterator = map.entrySet().iterator();
        while ((iterator.hasNext()))System.out.println(iterator.next());

        java.util.Map<Integer,Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1,2);
        linkedMap.put(2,3);
        linkedMap.put(3,4);
        linkedMap.put(4,5);
        linkedMap.put(1,2);
        linkedMap.put(2,3);

        linkedMap.remove(1);
        System.out.println(linkedMap);
        System.out.println(linkedMap.get(1));
    }
}
