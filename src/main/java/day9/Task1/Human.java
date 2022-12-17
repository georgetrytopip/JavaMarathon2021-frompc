package day9.Task1;

public class Human {
    String name;

    public Human (String name){
        this.name = name;
    }

    public static String getName(Human h){
        return h.name;
    }

    public void printInfo(){
        System.out.println("Это чeловек с именем " + this.name);
    }

}
