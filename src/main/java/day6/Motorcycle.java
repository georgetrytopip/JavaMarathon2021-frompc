package day6;

public class Motorcycle {

    private String model;
    private String color;
    private int year;


    public Motorcycle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("This is motorcycle");
    }

    public int yearDifference(int inputYear) {
        int result = inputYear - this.year;

        if (result < 0) {
            result = Math.abs(result);
        }
        return result;
    }
}


