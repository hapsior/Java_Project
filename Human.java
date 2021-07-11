package com.company;

import java.util.ArrayList;

public class Human {
    public String firstName;
    public String lastName;
    public int age;
    public ArrayList<Animal> animals;

    public Human(String _firstName,String _lastName,int _age){
        this.firstName=_firstName;
        this.lastName=_lastName;
        this.age=_age;
    }
    public void addAnimalToFarm(Animal animal){
        animals.add(animal);
    }
    public void checkAllOfTheAnimals(){
        for(int i=0;i< animals.size();i++){
            System.out.println(animals.get(i).getName());
            System.out.println(animals.get(i).isOutside);
            animals.get(i).isAnimalAlive();
            System.out.println(animals.get(i).getWeight());
        }
    }
}
