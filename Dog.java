package com.company;

public class Dog extends Animal{


    public Dog(String _name, boolean _isOutside, boolean _isAlive, double _weight,Human _owner) {
        super(_name, _isOutside, _isAlive, _weight,_owner);
        this.setName(_name);
        this.isOutside=_isOutside;
        this.isAlive=true;
        this.weight=_weight;
    }

    public void throwBall(){
        System.out.println("He runs out for it.");
    }
    public void secureArea(){
        isOutside=true;
    }
}
