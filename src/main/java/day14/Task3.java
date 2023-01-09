package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("pee");

        try {
            System.out.println(parseFileToObjList(file));
        } catch (IllegalArgumentException e) {
            System.out.println("В файле некорректные значения");
        }



    }

    public static List<Person> parseFileToObjList(File file){

       List<Person>personList = new ArrayList<>(Arrays.asList());

        try {
            Scanner scan = new Scanner(file);


            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String [] parsedNamesAges = line.split(" ");

                if(parseInt(parsedNamesAges[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                Person person = new Person (parsedNamesAges[0], parseInt(parsedNamesAges[1]));
                personList.add(person);
            }

            return personList;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }
}
