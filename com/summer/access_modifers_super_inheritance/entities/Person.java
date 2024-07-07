package com.summer.access_modifers_super_inheritance.entities;

import com.summer.access_modifers_super_inheritance.enums.Gender;

public class Person {
    String name;
    int age;

    Gender gender;

    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        for(Gender genderValue: Gender.values()){
            if(genderValue.getValue().equals(sex))this.gender=genderValue;
        }
    }

    public String getName(){return this.name;}

    public void sayHi(){
        System.out.println("My name is "+this.name);
    }

    public int getAge(){return this.age;}

    Gender getGender(){return this.gender;}
}
