package com.summer.access_modifers_super_inheritance.entities;

import com.summer.access_modifers_super_inheritance.enums.JobCategory;

public class SalariedPerson extends Person implements com.summer.access_modifers_super_inheritance.interfaces.Person {
    private final JobCategory jobCategory = JobCategory.SALARIED;

    SalariedPerson(String name,int age,String sex){
        super(name,age,sex);
    }

    @Override
    public void tellProfession() {
        System.out.println("I am working as "+this.jobCategory+" individual");
    }

    public void sayHi(){
        System.out.println("Hi ! I am inside protected method");
    }
}
