package com.summer.hashmap_implementation;

import java.util.LinkedList;

public class CustomHashMap {

  private final Double lamda = 1.5;
  private static final Integer initialCapacityDefault = 5;
  private Integer initialCapacity;
  private LinkedList<Node>[] buckets;
  private Integer capacity;
  private Integer size;
  private Double loadFactor;

  CustomHashMap() {
    this(initialCapacityDefault);
  }

  CustomHashMap(int initialCapacity) {
    this.buckets = new LinkedList[initialCapacity];
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new LinkedList<Node>();
    }
    this.loadFactor = 0.0;
    this.capacity = initialCapacity;
    this.size = 0;
    this.initialCapacity = initialCapacity;
  }

  public void put(Integer key, Integer value) {
    final var idx = hashFunction(key);
    final var bucket = this.buckets[idx];
    final var node = new Node(key, value);

    bucket.add(node);
    this.size++;
    this.loadFactor = Double.valueOf(this.size) / Double.valueOf(this.capacity);

    if (this.loadFactor > this.lamda) rehash();
  }

  public Integer getValue(Integer key) {
    final var idx = hashFunction(key);
    final var bucket = this.buckets[idx];

    var iterator = bucket.iterator();
    while (iterator.hasNext()) {
      var node = iterator.next();
      if (node.getKey().equals(key)) return node.getValue();
    }

    System.out.println("Get: No Such Element with key : " + key);
    return null;
  }

  public void delete(Integer key) {
    final var idx = hashFunction(key);
    final var bucket = this.buckets[idx];

    var iterator = bucket.iterator();
    while (iterator.hasNext()) {
      var node = iterator.next();
      if (node.getKey().equals(key)) {
        bucket.remove(node);
        this.size--;
        this.loadFactor = Double.valueOf(this.size) / Double.valueOf(this.capacity);
        if (this.loadFactor < this.lamda / 2 && this.capacity != this.initialCapacity) rehash();
        return;
      }
    }

    System.out.println("Delete: No Element present with key : " + key);
  }

  public Boolean containsKey(Integer key) {
    final var idx = hashFunction(key);
    final var bucket = this.buckets[idx];

    var iterator = bucket.iterator();
    while (iterator.hasNext()) {
      var node = iterator.next();
      if (node.getKey().equals(key)) return true;
    }

    return false;
  }

  public int size(){
      return this.size;
  }

  private int hashFunction(Integer key) {
    return key % this.capacity;
  }

  private void rehash() {
    if (this.loadFactor <= this.lamda && this.loadFactor >= this.lamda / 2) return;
    final var oldBuckets = this.buckets;

    if (this.loadFactor > this.lamda) this.capacity *= 2;
    else this.capacity /= 2;

    this.buckets = new LinkedList[this.capacity];
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new LinkedList<Node>();
    }
    this.loadFactor = 0.0;
    this.size = 0;

    for (int i = 0; i < oldBuckets.length; i++) {
      var iterator = oldBuckets[i].iterator();
      while ((iterator.hasNext())) {
        var node = iterator.next();
        this.put(node.getKey(), node.getValue());
      }
    }
  }
}
