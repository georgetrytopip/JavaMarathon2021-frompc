//package day12.task4;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//
//public class Task4 {
//    public static void main(String[] args) {
//
//        List <String> members1 = new ArrayList<>();
//        members1.add("Сергей Рахманинов");
//        members1.add("Жванецкий");
//        members1.add("Пушкин");
//
//        List <String> members2 = new ArrayList<>();
//        members2.add("Татарка");
//        members2.add("Крутые перцы");
//        members2.add("Пацаны вообще ребята");
//
//
//        MusicBand newMusicBand = new MusicBand("Zalupa", 1998, members1);
//        MusicBand secondMusicBand = new MusicBand("Pidori", 2021, members2);
//
//        MusicBand.transferMembers(newMusicBand, secondMusicBand);
//
//        MusicBand.printMembers(newMusicBand);
//        System.out.println("Next line");
//        MusicBand.printMembers(secondMusicBand);
//    }
//}
