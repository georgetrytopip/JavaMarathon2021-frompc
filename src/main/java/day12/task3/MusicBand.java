package day12.task3;

public class MusicBand {
    private String name;
    private int year;

    MusicBand (String name, int year){
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String getName() {
        return this.name;
    }
}
