package day9.Task2;

public abstract class  Figure {

    String color;

    Figure(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public abstract double area();
    public abstract double perimeter();
}
