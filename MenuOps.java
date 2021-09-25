package com.company;


import java.util.List;
import java.util.Scanner;

public class MenuOps {
    public void Login(List<Human> list){
        String login="";
        String password="";
        Scanner input=new Scanner(System.in);
        System.out.println("login: ");
        login = input.nextLine();
        System.out.println("password: ");
        password = input.nextLine();
        for (int i = 0; i <list.size() ; i++) {
            if(login.equals(list.get(i).login) && password.equals(list.get(i).password)){
                System.out.println("-----------------");
                System.out.println("First name: "+list.get(i).firstName);
                System.out.println("Last name: "+list.get(i).lastName);
                System.out.println("Age: "+list.get(i).age);
                System.out.println("List of animals: "+list.get(i).animals);
                System.out.println("-----------------");
                //      Sprzedaj zwierze
                //      Kup zwierze
                //      Wyprowadz na zewnatrz zwierze
                //      Wprowadz zwierze
            }
        }
    }
public void Submenu(){

    Scanner input=new Scanner(System.in);
    String select = "";
    while(!select.equals("0")) {
        System.out.println("1.Sell Animal\n2.Buy Animal\n3.Take Animal Outside\n4.Take Animal Inside\n\n0.Exit to login screen");
        select=input.nextLine();
        switch (select) {
            case "1":
                //TODO SellAnimal()
                break;
            case "2":
                //TODO BuyAnimal()
                break;
            case "3":
                //TODO TakeAnimalOutside()
                break;
            case "4":
                //TODO TakeAnimalInside()
                break;
            case "0":
                System.out.println("Going back to login screen");
                break;
            default:
                System.out.println("Wrong value has been choosen, to exit type 0");
                break;
        }
    }
    }

}


