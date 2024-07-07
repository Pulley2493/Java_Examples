package com.summer.access_modifers_super_inheritance.enums;

public enum Gender {
    MALE("M"),
    FEMALE("F");

    private String value;
    Gender(String value){
        this.value= value;
    }

    public String getValue(){return this.value;}
}
