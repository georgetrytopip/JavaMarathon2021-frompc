package day4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        int n = 100;
        int[] massive = new int[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 10001);
        }

        int sum = 0;
        int sum_1 = 0;

        int countTriplets = massive.length - 2;
        int f = 0;

        for (int z = 0; z < countTriplets; z++) {
            sum = massive[z] + massive[z + 1] + massive[z + 2];


            if (sum > sum_1) {
                sum_1 = sum;
                f = z;

            }

        }

        System.out.println(sum_1);
        System.out.println(f);

    }
}


