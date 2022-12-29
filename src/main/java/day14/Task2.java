package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file = new File("people");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file){
        List<String>parsedNamesAges = new ArrayList<>(Arrays.asList());


        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] namesAgesString  = line.split(" ");

                if(Integer.parseInt(namesAgesString[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                parsedNamesAges.add(line);
            }
            return parsedNamesAges;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Формат файла неверен");
        }
        return null;

    }

}
