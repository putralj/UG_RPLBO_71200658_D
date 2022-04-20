package com.UG9A.dota;

public class MagicCharacter extends Character{
    protected int mana;

    public MagicCharacter(String name, int health, int damage, int mana) {
        super(name, health, damage);
        this.mana = mana;
    }

    public void attacked(int damageReceived){
        this.health = this.health - damageReceived;
        super.attacked(this.health);
    }

    public void showCharacterInfo(){
        super.showCharacterInfo();
        System.out.println("Mana\t:" + this.mana);
    }
}
