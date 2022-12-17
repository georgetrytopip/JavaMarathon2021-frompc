package day9.Task2;

public class Circle extends Figure {
    double radius;

    Circle(String color, double radius) {

        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
