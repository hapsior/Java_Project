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
    public String login;
    public String password;
    public Human(String firstName,String lastName,int age,double money,String login,String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.money=money;
        this.login=login;
        this.password=password;
    }
    public void addAnimalToFarm(Animal animal){
        this.animals.add(animal);
    }
    public void CheckAnimal(Animal animal){
            System.out.println(animal.getName());
            System.out.println(animal.isOutside);
            animal.isAnimalAlive();
            System.out.println(animal.GetWeight());


    }
    public boolean CheckAnimalAvailability(Animal animal){
        for (int i = 0; i < animals.size() ; i++) {
            if(animals.get(i) ==animal){
                return true;
            }
        }
            return false;
    }

    public List<String> DisplayAnimals(){
        List<String> animalList=new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            animalList.add(animals.get(i).getClass().getSimpleName().toString()  + " " + animals.get(i).getName());
        }
            return animalList;
    }
}
