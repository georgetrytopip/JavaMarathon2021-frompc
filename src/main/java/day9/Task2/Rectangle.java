package day9.Task2;

public class Rectangle extends Figure{
    double length;
    double width;


    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        double area = length * width;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = (length + width)*2;
        return 0;
    }
}
