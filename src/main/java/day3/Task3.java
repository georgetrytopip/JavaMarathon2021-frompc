package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            if (y != 0) {
                double z = x / y;
                System.out.println(z);
                continue;
            }

            System.out.println("Деление на 0");
        }
    }
}


