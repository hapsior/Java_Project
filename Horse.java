package com.company;

public class Horse extends Animal {
    public Horse(String name, boolean isOutside, boolean isAlive, double weight,Human owner) {
        super(name, isOutside, isAlive, weight, owner);
        this.setName(name);
        this.isOutside=isOutside;
        this.isAlive=true;
        this.weight=weight;
    }
}
