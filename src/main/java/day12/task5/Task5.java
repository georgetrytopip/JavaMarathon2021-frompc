package day12.task5;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<Member> members = new ArrayList<>(Arrays.asList(new Member("George", "Patton")));
        List<Member> members2 = new ArrayList<>(Arrays.asList(new Member("Gonzalo", "Jordan")));


        MusicBand newMusicBand = new MusicBand("Zalupa", 1998, members);
        MusicBand secondMusicBand = new MusicBand("Pidori", 2021, members2);

        MusicBand.transferMembers(newMusicBand, secondMusicBand);

        if(newMusicBand.getMembers().isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty"); //проверка списка на пустоту
        }
    }
}
