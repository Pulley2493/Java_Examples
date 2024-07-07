package com.summer.access_modifers_super_inheritance.entities;

import com.summer.access_modifers_super_inheritance.enums.JobCategory;

public class BusinessPerson extends Person implements com.summer.access_modifers_super_inheritance.interfaces.Person {

    private final JobCategory jobCategory = JobCategory.BUSINESS;
    BusinessPerson(String name,int age,String sex){
        super(name,age,sex);
    }

    @Override
    public void tellProfession() {
        System.out.println("I have a "+ this.jobCategory);
    }
}
