package com.summer.static_interface.models;

import com.summer.static_interface.interfaces.Appliance;

public class ElectricalAppliance implements Appliance {
    public void stop(){
        System.out.println("Stopping the appliance");
    };

    public void demo(){
        System.out.printf("Type of device : %s \n",Appliance.TYPE);
        Appliance.Summarize();
        start();
        stop();
    }
}
