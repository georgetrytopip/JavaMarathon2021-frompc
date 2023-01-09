package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("test");

        printResult(file);


    }

    public static void printResult(File file){
        try {
            Scanner scan = new Scanner(file);
            String line = scan.nextLine();
            String [] numbersString = line.split(",");
            double [] doubleList = new double[numbersString.length];

            double sum = 0;
            int counter = 0;

            for(String dbl : numbersString ) {
                doubleList[counter++] = Double.parseDouble(dbl);
            }

            for(double dbls : doubleList){
                sum = sum + dbls;
            }

            double mean = sum / counter;

            DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
            String result = decimalFormat.format(mean);

            System.out.print(mean + "-->" + result);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}


