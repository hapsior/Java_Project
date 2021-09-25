package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Human farmer=new Human("George","Kentuck",34,5000.00,"georgek","kentuck34");
        Human farmer2=new Human("Benjamin","Button",60,6000.00,"benjamin","pressthebutton");
        Animal dog=new Dog("Jackie",false,true,20.0,farmer);
        Animal dog2=new Dog("Chika",false,true,25,farmer2);
        Animal cow=new Cow("Muu",true,true,100.0,farmer);
        Animal cow2=new Cow("Umm",true,true,110.0,farmer2);
        Animal horse=new Horse("Apple",true,true,120,farmer);
        Animal horse2=new Horse("Keffie",true,true,115,farmer2);
        System.out.println(dog.getName());
        farmer.animals.add(dog);
        farmer.animals.add(cow);
        farmer.animals.add(horse);
        farmer2.animals.add(dog2);
        farmer2.animals.add(cow2);
        farmer2.animals.add(horse2);
        farmer.addAnimalToFarm((Animal) dog);
        farmer.checkAnimal((Animal)dog);

        List<Human> humanList=new ArrayList<Human>();
        humanList.add(farmer);
        humanList.add(farmer2);
        dog.sellAnimal(farmer,farmer2,1000);
        farmer2.checkAnimal(dog);
        Scanner input=new Scanner(System.in);
        String select = "";
        while(!select.equals("2"))
        {
            System.out.println("1.Log in!\n2.Exit");
            select = input.nextLine();
            switch(select){
                case "1":
                    MenuOps ops=new MenuOps();
                    ops.Login(humanList);
                    ops.Submenu();
                    break;

                case "2":
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Incorrect value, please try once again");
                    break;
            }

        }
        
        //Menu ze switch casem
        //1. Zaloguj sie                 DONE
        //2. Wyjdz z programu            DONE
        //      Stan zwierzat na farmie
        //      Sprzedaj zwierze
        //      Kup zwierze
        //      Wyprowadz na zewnatrz zwierze
        //      Wprowadz zwierze
        //
        //stan zwierzat na farmie
        //logowanie sie jako farmer
        //
    }
}
