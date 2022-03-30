package com.company;

public class Warrior extends Hero {
    public Warrior(int health, int damage, Details details, AbilityEnum abilityEnum) {
        super(health, damage, details, abilityEnum);
    }
    private String weapon;

    public Warrior(int health, int damage, Details details, AbilityEnum abilityEnum, String weapon) {
        super(health, damage, details, abilityEnum);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }
}
