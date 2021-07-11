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
    public Animal(String _name,boolean _isOutside,boolean _isAlive,double _weight,Human _owner){
        this.name=_name;
        this.isOutside=_isOutside;
        this.isAlive=_isAlive;
        this.weight=_weight;
        this.owner=_owner;
    }
    public String getName(){
        return name;
    }
    public void setName(String _name){
        this.name=_name;
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
