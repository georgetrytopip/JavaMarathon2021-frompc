package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();
        PrintWriter pw = new PrintWriter("file1");
        for (int i = 0; i < 1000; i++) {
            pw.print(random.nextInt(100) + ",");
        }
        pw.close();

        PrintWriter pw1 = new PrintWriter("file2");

        File file1 = new File ("file1");
        Scanner scan = new Scanner(file1);

        String line = scan.nextLine();

        String [] file1Strings = line.split(",");
        int [] file1Int = new int[file1Strings.length];



        int sum = 0;
        int counter = 0;


        for (String s : file1Strings) {
            sum += parseInt(s);
            counter ++;
            if(counter == 20) {
                pw1.println(sum / 20.0);
                counter = 0;
                sum = 0;
            }
        }
        pw1.close();

        File file = new File("file2");

        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {

        Scanner scan = new Scanner(file);
        List<Double> parsedFile = new ArrayList<>();
        while(scan.hasNextDouble()){
            parsedFile.add(scan.nextDouble());
        }
        int sum = 0;

        for(Double d : parsedFile) {
            sum += d;
        }
        System.out.println(sum);
    }
}
