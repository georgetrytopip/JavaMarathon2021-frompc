package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 11);
        }

        for (int x : numbers) {
            System.out.println(x);
        }
        System.out.println(numbers.length);

        int counter = 0;
        for (int y : numbers) {
            if (y >= 8) {
                counter = counter + 1;
            }
        }
        System.out.println(counter);

        int counter_2 = 0;
        for (int m : numbers) {
            if (m == 1) {
                counter_2 = counter_2 + 1;
            }
        }
        System.out.println(counter_2);

        int counter_3 = 0;
        for (int k : numbers) {
            if (k % 2 == 0) {
                counter_3 = counter_3 + 1;
            }
        }
        System.out.println(counter_3);

        int counter_4 = 0;
        for (int l : numbers) {
            if (l % 2 != 0) {
                counter_4 = counter_4 + 1;
            }
        }
        System.out.println(counter_4);

        int sum = 0;
        for (int t = 0; t < numbers.length; t++) {
            sum = sum + numbers[t];
        }
        System.out.println(sum);
    }
}



