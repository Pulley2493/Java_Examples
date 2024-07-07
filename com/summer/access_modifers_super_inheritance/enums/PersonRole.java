package com.summer.access_modifers_super_inheritance.enums;

public enum PersonRole {
    SE("Software Engineer"),
    EP("Entrepreneur"),
    SELF_EMPLOYED("Self Employed");

    String value;
    PersonRole(String value){
        this.value = value;
    }

    String getValue(){
        return this.value;
    }
}
