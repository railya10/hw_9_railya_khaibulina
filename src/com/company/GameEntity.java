package com.company;

public class GameEntity {
    private int health;
    private int damage;
    Details details;
    AbilityEnum abilityEnum;

    public GameEntity(int health, int damage, Details details, AbilityEnum abilityEnum) {
        this.health = health;
        this.damage = damage;
        this.details = details;
        this.abilityEnum = abilityEnum;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Details getDetails() {
        return details;
    }

    public AbilityEnum getAbilityEnum() {
        return abilityEnum;
    }

           public String getInfo(){
            return "Health: " + health +
                    "\nDamage: " + damage +
                    "\nAge: " + details.getAge()+
                    "\nCountry: " + details.getCountry();

    }
}
