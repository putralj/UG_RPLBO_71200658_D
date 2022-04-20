package com.UG9A.dota;

public abstract class PhysicalCharacter extends Character{
    private int armor;

    public PhysicalCharacter(String name, int health, int damage, int armor) {
        super(name, health, damage);
        this.armor = armor;
    }

    public void showCharacterInfo(){
        super.showCharacterInfo();
        System.out.println("Armor\t:" + this.armor);

    }

    public void attacked(int damageReceived){
        int totalDamage;
        totalDamage = damageReceived - this.armor;
        this.health =  this.health - totalDamage;

    }
}
