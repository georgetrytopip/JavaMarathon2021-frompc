package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(); //создание нового динамического массива
        // при создании массива указываем тип элементов в массиве. В конкретном случае тип значений в массиве - integer

        for(int i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList.get(99));// узнаем значение элемента с индексом 99

        System.out.println(arrayList.size()); //узнаем размер массива

        for(Integer x : arrayList) {
            System.out.println(x);
        } //проходимся по всем элементам массива

        arrayList.remove(5); //удаление элемента из массива по индексу

        arrayList.add(3, 12); //добавление элемента на конкретное место (по конкретному индексу)


        //практикуемся с создании динамических списков

        List <String> autoList = new ArrayList<>(Arrays.asList("Audi", "BMW", "Tesla", "Mercedes", "Jeep"));
        autoList.remove(0);
        autoList.add(2, "Lada");

        for(String x : autoList) {
            System.out.println(x);
        }



    }
}
