package com.summer.sort_techniques;

import java.util.Objects;

public class Car implements Comparable<Car>{
    public int Price;
    public int Speed;
    public int compareTo(Car car){
        if(this.Price == car.Price)return 0;
        return this.Price > car.Price ? 1:-1;
    }
}
