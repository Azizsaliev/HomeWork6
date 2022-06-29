package com.company;

public class Boss extends GameEntity {

    public Boss(int health, int damage) {
        super(health, damage);
    }

    Weapon weapon = new Weapon("Stick", "Merlin");

    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
