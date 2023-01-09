package day14;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getPersonName(){
        return this.name;
    }

    public int getAge(){
        return age;
    }


    @Override
    public String toString(){
        return "Person{" +
                "name='" + name +'\'' +
                ", year =" + age+
                '}';
    }
}


