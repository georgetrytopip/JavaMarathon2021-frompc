package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();


        addNumbersToList(10, 20, numbers);

        for(Integer x : numbers) {
            System.out.println(x);
        }


    }

    public static void addNumbersToList(int a, int b, List<Integer> numbers) {
        while (a <= b) {
            if (a % 2 == 0) {
                numbers.add(a);
            }
            a++;
        }
    }
}







