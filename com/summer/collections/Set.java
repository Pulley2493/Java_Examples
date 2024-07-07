package com.summer.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String args[]){
        final var set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(3);
        set.add(4);

        var set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);

        set.addAll(set2);
        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext())System.out.println(iterator.next());

        final var linkedSet = new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(2);
        linkedSet.add(3);
        linkedSet.add(4);
        linkedSet.remove(3);
        linkedSet.add(5);
        linkedSet.add(2);
        linkedSet.add(1);
        linkedSet.add(3);
        System.out.println(linkedSet);
    }
}
