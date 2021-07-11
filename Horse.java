package com.company;

public class Horse extends Animal {
    public Horse(String _name, boolean _isOutside, boolean _isAlive, double _weight,Human _owner) {
        super(_name, _isOutside, _isAlive, _weight,_owner);
        this.setName(_name);
        this.isOutside=_isOutside;
        this.isAlive=true;
        this.weight=_weight;
    }
}
