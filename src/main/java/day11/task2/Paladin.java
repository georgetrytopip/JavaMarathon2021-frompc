package day11.task2;

import day11.task2.interfaces.Healer;

public class Paladin extends Hero implements Healer {



    Paladin(){
        health = 100;
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    public int getPhysAtt(){
        return physAtt;
    }

    public double getHealth(){
        return health;
    }

    public double getPhysDef(){
        return physDef;
    }

    public double getMagicDef(){
        return magicDef;
    }


    @Override
    public void healHimself() {
        health = health + 25;
        if(health >= 100) {
            health = 100;
        } else {
            return;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health = hero.health + 10;
        if(hero.health >= 100) {
            hero.health = 100;
        } else {
            return;
        }
    }
}

