package com.company;

public class Cow extends Animal{

    public Cow(String name, boolean isOutside, boolean isAlive, double weight,Human owner) {
        super(name, isOutside, isAlive, weight,owner);
        this.setName(name);
        this.isOutside=isOutside;
        this.isAlive=true;
        this.weight=weight;
    }

}
