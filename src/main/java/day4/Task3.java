package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrics = new int[12][8];


        Random random = new Random();


        for (int i = 0; i < matrics.length; i++) {
            for (int j = 0; j < matrics[i].length; j++) {
                matrics[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < matrics.length; i++) {
            for (int j = 0; j < matrics[i].length; j++) {
                System.out.print(matrics[i][j] + " ");
            }

            System.out.println();
        }



        int maxSum = 0;
        int maxSumIndex = 0;

        for (int i = 0; i < matrics.length; i++) {

            int a = 0;

            for (int j = 0; j < matrics[i].length; j++) {
                a = a + matrics[i][j];
            }

            if (a >= maxSum) {
                maxSum = a;
                maxSumIndex = i;
            }

        }

        System.out.println(maxSumIndex);


    }
}














