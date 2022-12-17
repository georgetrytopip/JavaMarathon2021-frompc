package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int value = a+1;
        int x;

        if (a > b) {
            System.out.println("Некорректный ввод");
        }

        while (value < b){
                x = value % 5;
                if(x == 0 & value % 10 != 0){
                    System.out.print(value + " ");
                }
                value++;
            }
    }
}







