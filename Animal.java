package com.company;

public class Animal {
    private String name;
    private boolean isOutside;
    private boolean isAlive;
    private double weight;


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
}
