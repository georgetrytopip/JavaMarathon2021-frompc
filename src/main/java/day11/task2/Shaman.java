package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {

    private final double magicAtt = 15;

    Shaman() {
        health = 100;
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
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


    public void healHimself() {
        health = health + 50;
        if(health >= 100) {
            health = 100;
        } else {
            return;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health = hero.health + 30;
        if(hero.health >= 100) {
            hero.health = 100;
        } else {
            return;
        }
    }
}

