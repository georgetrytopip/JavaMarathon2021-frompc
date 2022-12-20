package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Member> members = new ArrayList<>();

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
        b.members.addAll(a.getMembers());
    }

    public void printMembers() {
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }



}






