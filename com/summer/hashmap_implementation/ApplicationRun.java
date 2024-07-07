package com.summer.hashmap_implementation;

public class ApplicationRun {
  public static void main(String args[]) {
    CustomHashMap customHashMap = new CustomHashMap();
    customHashMap.put(2, 10);
    customHashMap.put(1, 3);
    customHashMap.put(7, 10);
    customHashMap.put(0, 11);
    customHashMap.put(3, 20);
    System.out.println(customHashMap + "Before Rehashing");
    customHashMap.put(4, 30);
    customHashMap.put(8, 31);
    customHashMap.put(9, 32);
    System.out.println(customHashMap + "Post Rehashing");

    customHashMap.put(12, 10);
    customHashMap.put(11, 3);
    customHashMap.put(17, 10);
    customHashMap.put(10, 11);
    customHashMap.put(13, 20);

    customHashMap.put(14, 30);
    customHashMap.put(18, 31);
    customHashMap.put(19, 32);
    System.out.println(customHashMap + "Post Rehashing - 2");

    System.out.println("Contains Key 19 : " + customHashMap.containsKey(19));

    customHashMap.delete(12);
    customHashMap.delete(11);
    customHashMap.delete(17);
    customHashMap.delete(10);
    customHashMap.delete(13);

    System.out.println("Size of Map : " + customHashMap.size());
    customHashMap.delete(14);
    customHashMap.delete(18);
    customHashMap.delete(19);
    System.out.println(customHashMap + "Post Rehashing - 3");

    System.out.println("Contains Key 19 : " + customHashMap.containsKey(19));
    System.out.println("Contains Key 1 : " + customHashMap.containsKey(1));
    System.out.println("Contains Key 3 : " + customHashMap.containsKey(3));

    System.out.println("Value of key 1 : " + customHashMap.getValue(1));
    System.out.println("Value of key  3 : " + customHashMap.getValue(3));
    System.out.println("Value of key 14 : " + customHashMap.getValue(14));

    customHashMap.delete(2);
    customHashMap.delete(1);
    customHashMap.delete(7);
    customHashMap.delete(0);
    customHashMap.delete(3);

    customHashMap.delete(4);
    customHashMap.delete(8);
    customHashMap.delete(9);
    System.out.println(customHashMap + "Post Rehashing - 4");
    System.out.println("Contains Key 1 : " + customHashMap.containsKey(1));
    System.out.println("Contains Key 3 : " + customHashMap.containsKey(3));

    System.out.println("Size of Map : " + customHashMap.size());
  }
}
