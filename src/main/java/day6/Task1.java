package day6;

public class Task1 {
    public static void main(String[] args) {

        Motorcycle moto = new Motorcycle("Yamaha", "Red", 2050);

        int a = moto.yearDifference(2010);
        System.out.println(a);
    }
}
