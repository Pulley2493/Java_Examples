package com.summer.sort_techniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args){
        Car bmw = new Car();
        bmw.Price = -1;

        Car nano = new Car();
        nano.Price = -10;

        Car punch = new Car();
        punch.Price = 0;

        Car lambo = new Car();
        lambo.Price = 20;

        List<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(lambo);
        cars.add(punch);
        cars.add(nano);

        for(var car : cars)System.out.println(car.Price);
//        System.out.println(cars);
        Collections.sort(cars);
//        System.out.println(cars);
        for(var car : cars)System.out.println(car.Price);
    }
}
