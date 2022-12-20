package day12.task4;

public class Member {
    private String Name;
    private String SecondName;

    Member(String Name, String SecondName){
        this.Name = Name;
        this.SecondName = SecondName;
    }

    public String getName(){
        return this.Name;
    }

    public String getSecondName(){
        return this.SecondName;
    }

    public String toString(){
        return Name + " " + SecondName;
    }





}
