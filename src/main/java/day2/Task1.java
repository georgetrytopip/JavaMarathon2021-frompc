package day2;

import java.io.InputStream;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x >= 1 && x <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (x >= 5 && x <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (x <= 0) {
            System.out.println("Ошибка ввода");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
