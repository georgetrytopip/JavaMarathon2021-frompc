package day7;

//    Создать класс Самолет (Airplane) с полями:
//            manufacturer (изготовитель)
//            year (год выпуска)
//            length (длина)
//            weight (вес)
//            fuel (количество топлива в баке)

public class Airplane {
    private String name;
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private int fuel = 0;

    public Airplane(String name, String manufacturer, int year, double length, double weight){
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return manufacturer;
    }

    public int setYear(int year) {
        this.year = year;
        return year;
    }

    public double setLength(double length) {
        this.length = length;
        return length;
    }

    public double setWeight(double weight) {
        this.weight = weight;
        return weight;
    }

    public int getFuelLevel(){
        return fuel;
    }

    public int fillUp(int n) {
        this.fuel = n;
        return n;
    }


    public static void compareAirplanes(Airplane a, Airplane b) {
        if (a.length < b.length) {
            System.out.println(b.name + " длиннее");
        } else if (a.length > b.length) {
            System.out.println(a.name + " длиннее");
        }
    }

}





