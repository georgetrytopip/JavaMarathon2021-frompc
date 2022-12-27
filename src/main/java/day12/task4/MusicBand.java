//package day12.task4;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class MusicBand {
//    private String name;
//    private int year;
//    private List<String> members;
//
//    MusicBand(String name, int year, List<String> members) {
//        this.name = name;
//        this.year = year;
//        this.members = members;
//    }
//
//    public int getYear() {
//        return this.year;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public List<String> getMembers() {
//        return members;
//    }
//
//    public void setMembers(List<String> members) {
//        this.members = members;
//    }
//
//    public static void transferMembers(MusicBand a, MusicBand b) {
//        for (String members : a.getMembers()) {
//            b.getMembers().add(members);
//        }
//        a.getMembers().clear();
//    }
//
//
//    public static void printMembers (MusicBand a){
//        for (String member : a.getMembers()) {
//            System.out.println(member.toString());
//        }
//    }
//}
//
//
//
//
//
//
//
//
