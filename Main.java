package com.company;

public class Main {

    public static void main(String[] args) {

        Human farmer=new Human("George","Kentuck",34,5000.00);
        Animal dog=new Dog("Jackie",false,true,20.0,farmer);
        System.out.println(dog.getName());
        farmer.addAnimalToFarm((Animal) dog);
        farmer.checkAnimal((Animal)dog);
        Human farmer2=new Human("Benjamin","Button",60,6000.00);
        dog.sellAnimal(farmer,farmer2,1000);
        farmer2.checkAnimal(dog);
    }
}
