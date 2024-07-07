package com.summer.access_modifers_super_inheritance.entities;

import com.summer.access_modifers_super_inheritance.enums.PersonRole;
import com.summer.access_modifers_super_inheritance.interfaces.Person;

public class Entrepreneur extends BusinessPerson implements Person {

    protected final PersonRole personRole = PersonRole.EP;
    public Entrepreneur(String name,int age,String sex){
        super(name,age,sex);
    }

    @Override
    public void sayHi(){
        System.out.println("Hi There! I am an Entrepreneur"+super.getGender());
    }
}
