package day9.Task1;

public class Student extends Human{
    private String groupName;


    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName(Student s){
        return s.groupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Это cтудент с именем " + this.name);
    }





}
