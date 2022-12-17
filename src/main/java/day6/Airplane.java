package day6;

//    Создать класс Самолет (Airplane) с полями:
//            manufacturer (изготовитель)
//            year (год выпуска)
//            length (длина)
//            weight (вес)
//            fuel (количество топлива в баке)

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private int fuel = 0;

    public Airplane(String manufacturer,  int year, double length, double weight){
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
}





