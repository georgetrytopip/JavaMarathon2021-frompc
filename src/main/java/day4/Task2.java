package day4;

import java.util.concurrent.SynchronousQueue;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


                int[] numbers = new int[100];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = (int) (Math.random() * 10001);
                }
                int min = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    min = Math.min(min, numbers[i]);
                }
                System.out.println(min);

                int max = numbers [0];

                for (int i = 1; i<numbers.length; i++) {
                    max = Math.max(max, numbers[i]);
                }

                System.out.println(max);

                int counter_1 = 0;
                for (int i = 1; i< numbers.length; i++) {
                    if (numbers[i] % 10 == 0) {
                        counter_1 = counter_1 + 1;
                    }
                }
                System.out.println(counter_1);

                int sum = 0;
                for (int t = 0; t < numbers.length; t++) {
                    if (numbers[t] % 10 == 0){
                        sum = sum + numbers[t];
                    }
                }
                System.out.println(sum);
            }

    }



