package day11.task2;

import day11.task2.interfaces.PhysAttack;

public class Warrior extends Hero {


    Warrior() {
        health = 100;
        physDef = 0.8;
        magicDef = 0;
        physAtt = 30;
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



}



