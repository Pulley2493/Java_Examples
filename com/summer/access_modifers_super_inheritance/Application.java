package com.summer.access_modifers_super_inheritance;

import com.summer.access_modifers_super_inheritance.services_a.ServiceA;
import com.summer.access_modifers_super_inheritance.services_a.ServiceB;

public class Application extends ServiceA{
    public static void main(String args[]){
        System.out.println("Hello World!");

        ServiceB serviceB = new ServiceB();
        serviceB.initiate();
    }
}
