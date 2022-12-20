package day12.task4;

import java.util.Arrays;


public class Task4 {
    public static void main(String[] args) {

        MusicBand newMusicBand = new MusicBand("Zalupa", 1998, Arrays.asList(new Member("Xui", "Jopa"), new Member("Lox", "Ochkastyi")));
        MusicBand secondMusicBand = new MusicBand("Pidori", 2021, Arrays.asList(new Member("Chu cheng", "Chengov"), new Member("Chong", "Cong")));

        MusicBand.transferMembers(newMusicBand, secondMusicBand);





    }




}
