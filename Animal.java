package com.company;

public abstract class Animal {
    private String name;
    protected boolean isOutside;
    protected boolean isAlive;
    protected double weight;
    private String forme;
    public final String[] formeTypes={"House","Stable","Cowshed"};
    private Object animal;
    public Human owner;
    public Animal(String name,boolean isOutside,boolean isAlive,double weight,Human owner){
        this.name=name;
        this.isOutside=isOutside;
        this.isAlive=isAlive;
        this.weight=weight;
        this.owner=owner;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){

        this.name=name;
    }
    public void feed(){
        if(weight>100){
            weight+=20;
            System.out.println("Actual weight: "+weight);
        }
        if(weight<100){
            weight+=7.5;
            System.out.println("Actual weight: "+weight);
        }
    }
    public void takeAnimalOutside(){
        if(isOutside==false){
            isOutside=true;
            weight-=20;
        }
        else{
            System.out.println("Animal "+name+" is already outside!");
        }
    }
    public void takeAnimalInside(){
        if(isOutside==true){
            isOutside=false;
            weight-=20;
        }
        else{
            System.out.println("Animal "+name+" is already inside!");
        }
    }
    public void isAnimalAlive(){
        if(weight<0){
            isAlive=false;
            System.out.println("OOPS, is dead");
        }
        else{
            System.out.println("Still lives");
        }
    }
    public double getWeight(){
        return weight;
    }
    public void sellAnimal(Human seller, Human buyer,double price){

        if(buyer.money>price&&owner==seller){
            buyer.addAnimalToFarm((Animal) animal);
            owner=buyer;
            System.out.println("Animal has been bought");
            seller.animals.remove((Animal) animal);
        }
        else{
            System.out.println("You cannot buy this animal");
        }
    }
}
