package com.UG9A.dota;

public class LegionCommander extends PhysicalCharacter implements TargetSkill {
    private int kill = 0;

    public LegionCommander(String name, int health, int damage, int armor) {
        super(name, health, damage, armor );
    }

    public void attack(Character target){
        target.attacked(this.damage);
        if (target.isDie()){
            this.kill += 1;
            this.damage += 10;
        }
    }

    public boolean skill(Character target){
        boolean win = false;
        if(!target.isDie() && !this.isDie()){
            target.attacked(this.damage);
            this.attacked(target.damage);
            if (target.isDie()){
                win = true;
            }
            else {
                win = false;
            }
        }
        return win;
    }
}
