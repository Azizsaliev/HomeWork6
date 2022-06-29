package com.company;

public class Main {

    public static void main(String[] args) {
 Boss boss = new Boss(999,99);
        System.out.println("Boss health" +boss.health+
                "\nBoss damage " + boss.damage +
                "\nBoss weapon name: " + boss.weapon.getName() +
                "\nBoss weapon type: " + boss.weapon.getType());

    }
}
