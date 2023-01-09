package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("/Users/georgeakhmedov/Desktop/JavaMarathon2021-frompc/src/main/resources/shoes.csv");

        convertFromCsv(file);


    }

    public static void convertFromCsv(File file) {

        try {
            Scanner scan = new Scanner(file);
            PrintWriter writer = new PrintWriter("missingshoes.txt");

            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                if (scan.nextLine().isEmpty()) {
                    throw new IOException();
                }


                String[] parsedCsv = line.split(";");

                if (parsedCsv.length > 3) {
                    throw new IOException();
                }

                if (parseInt(parsedCsv[2]) == 0) {
                    String a = String.join(",", parsedCsv);
                    writer.println(a);
                }

            }

            writer.close();
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный формат файла");
        }
    }
}


