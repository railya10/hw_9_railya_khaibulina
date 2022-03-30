package com.company;

public class Main {

    public static void main(String[] args) {

        Details version1 = new Details(25, "Africa");
        Details version2 = new Details(30, "Japan");

        Hero objectA = new Hero(300, 50, version1, AbilityEnum.ENERGY_ATTACK);

        Warrior objectB = new Warrior(250, 40, version2, AbilityEnum.FLASH_STRIKE, "Knife");
        Warrior objectC = new Warrior(150, 25, version1, AbilityEnum.INVISIBLE, "Dagger");

        System.out.println("Hero 1 -------------------------");
        System.out.println(objectA.getInfo());
        objectA.makeStrike();


        System.out.println("Hero 2 -------------------------");
        System.out.println((objectB.getInfo()));
        objectB.makeStrike();
        objectB.makeStrike("");

        System.out.println("Hero 3 -------------------------");
        System.out.println(objectC.getInfo());
        objectC.makeStrike();
        objectC.makeStrike("");
    }
}

