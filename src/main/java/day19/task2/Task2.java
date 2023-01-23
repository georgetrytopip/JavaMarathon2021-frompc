package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File taxifile = new File("C:\\Users\\Админ\\Downloads\\JavaMarathon2021-frompc\\src\\main\\resources\\taxi_cars.txt");
        Scanner scan = new Scanner(taxifile);
        Map<Integer, Point> map = new HashMap<>();


        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            String [] coordinatesList = line.split(" ");
            int [] intList = new int[coordinatesList.length];
            int counter = 0;
            for(String dbl : coordinatesList ) {
                intList[counter++]= Integer.parseInt(dbl);
            }
            map.put(intList[0], new Point(intList[1],intList[2]));
        }

//        for(Map.Entry<Integer, Point> entry : map.entrySet()){
//            System.out.println((entry.getKey() + " : " + entry.getValue().getX() + " : " + entry.getValue().getY()));
//        }


        while(true) {
            Scanner scanner = new Scanner(System.in);
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            Point point1 = new Point(x1, y1);
            Point point2 = new Point(x2, y2);

            if(point1.hashCode() < point2.hashCode()) {
                for (Map.Entry<Integer, Point> entry : map.entrySet()) {
                    if (entry.getValue().hashCode() > point1.hashCode() & entry.getValue().hashCode() < point2.hashCode()) {
                        System.out.println(entry.getKey());
                    }
                }
            } else{
                for (Map.Entry<Integer, Point> entry : map.entrySet()) {
                    if (entry.getValue().hashCode() < point1.hashCode() & entry.getValue().hashCode() > point2.hashCode()) {
                        System.out.println(entry.getKey());
                    }
                    }
                }
            }

        }
    }


