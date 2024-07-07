package com.summer.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class List {
    public static void main(String args[]){
        //Array List
        final var list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.remove(0);

        final var list2 = Arrays.asList(3,6,4);

        list.addAll(list2);

        System.out.println(list);

        var iteratorList =  list.iterator();
        while (iteratorList.hasNext())System.out.println(iteratorList.next());


        //Linked List
        final var linkedList = new LinkedList<>();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(4);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.addFirst(90);
        System.out.println(linkedList);
        var iteratorLinkList =  linkedList.iterator();
        while (iteratorLinkList.hasNext())System.out.println(iteratorLinkList.next());

        //Vector
        final var vectr = new Vector<>();
        vectr.add(9012);
        vectr.add(0,1111);
        vectr.add(1,232);

         vectr.remove(0);

        System.out.println(vectr);


    }
}
