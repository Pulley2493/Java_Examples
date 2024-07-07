package com.summer.hashmap_implementation;

public class Node {
    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    private Integer key;
    private Integer value;

    Node(Integer key, Integer value){
        this.key = key;
        this.value = value;
    }

    Node(){
        this.key = null;
        this.value = null;
    }
}
