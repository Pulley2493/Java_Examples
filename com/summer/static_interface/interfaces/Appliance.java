package com.summer.static_interface.interfaces;

public interface Appliance {

    //By default these are public static final
    String TYPE = "Appliance";
    default void start(){
        System.out.println("Appliance Started");
        currentStatus();
    }

    static void Summarize(){
        System.out.println("Appliances are devices of type electrical/electronics");
    }

    void stop();

    private static void currentStatus(){
        System.out.println("Running.....");
    }
}
