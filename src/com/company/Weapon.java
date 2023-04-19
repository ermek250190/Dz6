package com.company;

public class Weapon {
    private int Weapon;
    private String name;

    public Weapon(int weapon, String name) {
        Weapon = weapon;
        this.name = name;
    }

    public int getWeapon() {
        return Weapon;
    }

    public void setWeapon(int weapon) {
        Weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
