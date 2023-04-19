package com.company;

public class Boss extends GameEntity{

   Weapon weapon =  new Weapon(300,"pistolet");



    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int jizn, int uron) {
        super(jizn, uron);
    }
    public String printInfo(){
        System.out.println();
    }
}
