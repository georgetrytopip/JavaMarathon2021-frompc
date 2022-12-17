package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane firstAirplane = new Airplane("Boeing", "Germany", 2012, 20.5, 455.0);
        Airplane secondAirplane = new Airplane("Topolev", "Russia", 2018, 19.5, 1000.0);

        Airplane.compareAirplanes(firstAirplane, secondAirplane);

    }
}