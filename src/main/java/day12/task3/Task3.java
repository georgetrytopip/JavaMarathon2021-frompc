package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Lady Gaga", 2001);
        MusicBand band2 = new MusicBand("Red hot chilli peppers", 1995);
        MusicBand band3 = new MusicBand("System of a Down", 1994);
        MusicBand band4 = new MusicBand("Maneskin", 2010);

        List<MusicBand> musicBandList = new ArrayList<>(Arrays.asList(band1, band2, band3, band4));

        groupsAfter2000(musicBandList);


    }

    public static void groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newMusicBandList = new ArrayList<>(Arrays.asList());
        for (MusicBand band : bands) {
            if (band.getYear() < 2000) {
                newMusicBandList.add(band);
            }

        }
        for (MusicBand band : newMusicBandList) {
            System.out.println(band.getName());
        }

    }
}



