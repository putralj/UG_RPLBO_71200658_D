package com.UG9A.dota;

public class Lina extends MagicCharacter implements TargetSkill{
    public Lina(String name , int health, int damage, int mana) {
        super(name, health, damage, mana);
    }

    public boolean skill(Character target){
        boolean skillLaunch = false;
        if (this.mana >= 60){
            skillLaunch = true;
            target.attacked(600);
            this.mana -= 60;
        }
        else if (this.mana < 60){
            skillLaunch = false;
        }
        return skillLaunch;
    }

    public void attack(Character target){
        target.attacked(this.damage);
        if (target.isDie()){
            this.mana += 45;
        }
    }
}
