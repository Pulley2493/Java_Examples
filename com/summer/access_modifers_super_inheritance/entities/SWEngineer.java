package com.summer.access_modifers_super_inheritance.entities;

import com.summer.access_modifers_super_inheritance.enums.PersonRole;

public class SWEngineer extends SalariedPerson{

    PersonRole personRole = PersonRole.SE;
    public SWEngineer(String name,int age,String sex){
        super(name,age,sex);
    }

    @Override
    public void sayHi(){
        System.out.println("I am Er. "+super.getName());
    }
}
