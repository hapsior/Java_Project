package com.company;

import java.util.List;
import java.util.Scanner;

public class HumanMenu implements IHumanMenu  {

    private Human buyer;
    private Human seller;
    private List<Human> list;
    private Animal animal;
    private Double price;
    String login;
    //TODO
    @Override
    public void SellAnimal(String login) {

        if(seller.login.equals(login)){
            animal=PickAnimalToSell();
            buyer=PickFarmerToSellAnimal();
            price=GetPrice();
            animal.SellAnimal(seller,buyer,price);

        }
    }

    @Override
    public void BuyAnimal() {

    }

    @Override
    public void TakeAnimalOutside() {

    }

    @Override
    public void TakeAnimalInside() {

    }

    public void DisplayAvailableFarmers(String login, List<Human> list){
        for (int i = 0; i < list.size() ; i++) {
            if(!login.equals(seller.login)||!login.equals(buyer.login)){
                System.out.println(list.get(i).login);
            }
        }
    }
    private Animal PickAnimalToSell(){
        Animal animal;

        System.out.println("Pick animal you want to sell, type name of the animal!");
        seller.DisplayAnimals();
        Scanner input=new Scanner(System.in);
        String select = "";
        select=input.nextLine();
        for (Animal item: seller.animals){
            if(select.equals(item.getName())){
                animal=item;
                return animal;
            }
        }
        return null;
    }
    private Human PickFarmerToSellAnimal(){
        System.out.println("Pick farmer which you want to sell animal");
        DisplayAvailableFarmers(login,list);
        Scanner input=new Scanner(System.in);
        String select = "";
        select=input.nextLine();
        for (Human item:list) {
            if(login.equals(item.login)){
                return item;
            }
        }
        return null;
    }
    private Double GetPrice(){
        System.out.println("How much you want,put price?");
        Scanner input=new Scanner(System.in);
        Double select = 0.0;
        select=input.nextDouble();
        return select;
    }
}
