package day11.task2;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    double health;
    double physDef;
    double magicDef;
    int physAtt;

    @Override
    public double physicalAttack(Hero hero) {
        double physicalAttack;
        if (hero.physDef == 0) {
            physicalAttack = physAtt;
        } else {
            physicalAttack = physAtt - (physAtt * hero.physDef);
        }

        double heroHealthAfterAttack = hero.health - physicalAttack;
        if (heroHealthAfterAttack <= 0) {
            heroHealthAfterAttack = 0;
            hero.health = heroHealthAfterAttack;
        } else {
            hero.health = heroHealthAfterAttack;
        }
        return hero.health;
    }
}









