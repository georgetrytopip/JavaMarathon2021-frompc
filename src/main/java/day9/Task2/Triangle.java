package day9.Task2;

public class Triangle extends  Figure {
    double sidea;
    double sideb;
    double sidec;

    Triangle(String color, double sidea,double sideb, double sidec ) {
        super(color);
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }

    @Override
    public double area() {
        double halfperimeter = (sidea + sideb + sidec) / 2;
        double area = Math.sqrt(halfperimeter*(halfperimeter - sidea)*(halfperimeter * sideb)*(halfperimeter * sidec));
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = sidea + sideb + sidec;
        return perimeter;
    }
}
