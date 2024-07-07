package com.summer.access_modifers_super_inheritance.services_a;

import com.summer.access_modifers_super_inheritance.entities.Entrepreneur;
import com.summer.access_modifers_super_inheritance.entities.Person;
import com.summer.access_modifers_super_inheritance.entities.SWEngineer;

public class ServiceA{


     void initiateGreetings(){
        Entrepreneur entrepreneur = new Entrepreneur("Pulkit",29,"M");
        SWEngineer se = new SWEngineer("Lisa",38,"F");

        System.out.println("My name is : "+se.getName());
        se.tellProfession();
        se.sayHi();

        System.out.println("My name is : "+entrepreneur.getName());
        entrepreneur.tellProfession();
        entrepreneur.sayHi();

        Person person = new Person("Mona", 22, "F");
        System.out.println("My name is : "+person.getName());
        person.sayHi();
        System.out.println("I am "+person.getAge()+" years old");
    }
}
