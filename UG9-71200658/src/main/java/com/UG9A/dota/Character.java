package com.UG9A.dota;

public abstract class Character {
    protected int damage, health;
    protected String name;

    public Character(String name, int health, int damage) {
        this.damage = damage;
        this.health = health;
        this.name = name;
    }

    public void showCharacterInfo() {
        System.out.println("Hero\t:" + this.name);
        System.out.println("Health\t:" + this.health);
        System.out.println("damage\t:" + this.damage);
    }

    public boolean isDie() {
        boolean state = false;
        if (this.health <= 0)
            state = true;
        return state;
    }

    public void attacked(int receiveDamage){
        this.health -= receiveDamage;
    }
}
