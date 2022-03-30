package com.company;

public class Hero extends GameEntity {
    public Hero(int health, int damage, Details details, AbilityEnum abilityEnum) {
        super(health, damage, details, abilityEnum);
    }



    public void makeStrike() {
        System.out.println("Superability applied");
    }

    public final void makeStrike(String ability) {
        System.out.println("Ability applied: " + this.abilityEnum);
    }

}
