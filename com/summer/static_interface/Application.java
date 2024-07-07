package com.summer.static_interface;

import com.summer.static_interface.interfaces.Appliance;
import com.summer.static_interface.models.ElectricalAppliance;

public class Application {
    public static void main(String args[]){
        System.out.println("Hello World, You there ?");
        ElectricalAppliance electricalAppliance = new ElectricalAppliance();
        electricalAppliance.demo();

        Appliance appliance = new ElectricalAppliance();
        appliance.start();
        Appliance.Summarize();
        appliance.stop();
    }
}
