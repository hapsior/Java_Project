package com.company;

import java.util.ArrayList;
import java.util.List;

public class Human {
    public String firstName;
    public String lastName;
    public int age;
    public List<Animal> animals= new ArrayList<Animal>();
    public double money;
    public Dog dog;
    public Human(String _firstName,String _lastName,int _age,double _money){
        this.firstName=_firstName;
        this.lastName=_lastName;
        this.age=_age;
        this.money=_money;
    }
    public void addAnimalToFarm(Animal animal){
        this.animals.add(animal);
    }
    public void checkAnimal(Animal animal){
            System.out.println(animal.getName());
            System.out.println(animal.isOutside);
            animal.isAnimalAlive();
            System.out.println(animal.getWeight());


    }
    public boolean checkAnimalAvailability(Animal animal){
        for (int i = 0; i < animals.size() ; i++) {
            if(animals.get(i) ==animal){
                return true;
            }
        }
            return false;
    }
}
