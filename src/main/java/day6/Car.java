package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    // делаем set метод (сеттер)
    public void setModelAndColorAndYear(String modelname, String colorname, int yearvalue){

        if(modelname.isEmpty()) {
            System.out.println("Error. Model couldn't be empty");
        } else if(colorname.isEmpty()) {
            System.out.println("Error. Color couldn't be empty");
        } else {
            model = modelname;
            color = colorname;
            year = yearvalue;
        }
    }

    //делаем get метод (геттер)

    public String getModel(){
        return model;
    }

    public void info(){
        System.out.println("This is car");
    }
}
