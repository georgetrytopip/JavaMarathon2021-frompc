package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Member> members;

    MusicBand(String name, int year, List<Member> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return this.year;
    }

    public String getName() {
        return this.name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (Member members : a.getMembers()) {
            b.getMembers().add(members);
        }
        a.getMembers().clear();
    }


    public static void printMembers (MusicBand a){
        for (Member member : a.getMembers()) {
            System.out.println(member.toString());
        }
    }
}








