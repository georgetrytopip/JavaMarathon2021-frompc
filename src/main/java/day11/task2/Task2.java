package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        double a = paladin.getHealth();
        System.out.println(a);

        paladin.physicalAttack(magician);
        double z = magician.getHealth();
        System.out.println(z);

        shaman.healTeammate(magician);
        double h = magician.getHealth();
        System.out.println(h);

        magician.magicAttack(paladin);
        double l = paladin.getHealth();
        System.out.println(l);

        shaman.physicalAttack(warrior);
        double k = warrior.getHealth();
        System.out.println(k);

        paladin.healHimself();
        double q = paladin.getHealth();
        System.out.println(q);



//        magician.magicAttack(paladin);
//        shaman.physicalAttack(warrior);
//        paladin.healHimself();

        for(int i = 0; i<5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician.getHealth());
        }






//        double z = magician.getHealth();
//        System.out.println(z);
//
//        double a = paladin.getHealth();
//        System.out.println(a);
//
//        double b = magician.getHealth();
//        System.out.println(b);
//
//        double c = magician.getHealth();
//        System.out.println(c);
//
//        double d = paladin.getHealth();
//        System.out.println(d);
//
//        double e = warrior.getHealth();
//        System.out.println(e);
//
//        double f = paladin.getHealth();
//        System.out.println(f);

    }
}
