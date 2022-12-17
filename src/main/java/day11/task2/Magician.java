package day11.task2;

import day11.task2.interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    private final double magicAtt = 20;

    Magician() {
        health = 100;
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }

    public double getHealth() {
        return health;
    }

    @Override
    public double magicAttack(Hero hero) {
        double magicAttack;
        if (hero.magicDef == 0) {
            magicAttack = magicAtt;
        } else {
            magicAttack = magicAtt - (magicAtt * hero.magicDef);
        }

        double heroHealthAfterAttack = hero.health - magicAttack;
        if (heroHealthAfterAttack <= 0) {
            heroHealthAfterAttack = 0;
            hero.health = heroHealthAfterAttack;
        } else {
            hero.health = heroHealthAfterAttack;
        }
        return hero.health;
    }
}

