package com.UG9A.dota;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        DragonKnight dragonKnight = new DragonKnight("Dragon Knight", 1800, 95, 50);
        LegionCommander legionCommander = new LegionCommander("Legion Commander", 1800, 95, 30);
        Lina lina = new Lina("Lina", 800, 70, 120);

        lina.skill(dragonKnight);
        dragonKnight.skill();
        dragonKnight.attack(lina);
        dragonKnight.attack(lina);
        legionCommander.skill(lina);
        lina.skill(legionCommander);
        lina.showCharacterInfo();
        dragonKnight.showCharacterInfo();
        legionCommander.showCharacterInfo();
    }


}
