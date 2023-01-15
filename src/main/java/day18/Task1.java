package day18;


//Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя циклы (необходимо использовать рекурсивные вызовы).
//        Использовать статическое поле для хранения суммы не рекомендуется, такое решение нельзя назвать полноценно рекурсивным.
//
//        Пример:
//        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//        System.out.println(recursionSum(...)); // 65346
//
//        *recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.


import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {

        int [] jopa = {1,2,3,4,5,6,7,8};

        System.out.println(recursionSum(jopa, 0));

    }

    public static int recursionSum (int[] m, int i){

        if (i == m.length){
            return 0;
        }
        return m[i] + recursionSum(m, i+1 );
    }
}