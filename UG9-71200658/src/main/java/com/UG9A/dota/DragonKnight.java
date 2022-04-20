package com.UG9A.dota;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkills{
    private int dragonFormAttack;

    public DragonKnight(String name, int health, int damage, int armor) {
        super(name = "Dragon Knight", health = 1800, damage = 95, armor = 50);
    }

    public void skill(){
        this.dragonFormAttack = 2;
    }

    public void attack(Character target){
        target.attacked(this.damage);
        if (this.dragonFormAttack > 0){
            super.damage += 90;
            this.dragonFormAttack -= 1;
        }
    }
}
