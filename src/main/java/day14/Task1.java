package day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        File file = new File("test");

        try {
            System.out.println(printSumDigits(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IncorrectLengthException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static int printSumDigits(File file) throws FileNotFoundException, IncorrectLengthException {
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();
        String[] numbersString = line.split(",");
        int[] numbers = new int[10];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        if(counter != 10) {
            throw new IncorrectLengthException("В файле должно быть 10 чисел"); //выбрасываем исключение
        }

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}

