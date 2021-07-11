package com.company;

public abstract class Animal {
    private String name;
    protected boolean isOutside;
    private boolean isAlive;
    private double weight;
    private final String[] forme={"House","Stable","Cowshed"};
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
            weight+=10;
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
}
