package Final;

import java.util.*;

public class Ship{

    private int deckLength;
    private String shipName;
//    private  Deck deck;

    private List<Deck> decks;

    private Map<Integer, Deck> deckMap;



    Ship(int deckLength, String shipName) {
        this.deckLength = deckLength;
        this.shipName = shipName;
        deckMap = new HashMap<>();
    }

    public String getShipName(){
        return this.shipName;
    }

    public int getShipLength(){
        return this.deckLength;
    }

    public List<Deck> setDeckList(){
        this.decks = new ArrayList<>();
        return this.decks;
    }

    public List<Deck> getDecks(){
        return this.decks;
    }

    public int setHash(int coordinateA, int coordinateB){
        int result = coordinateA;
        result = 31 * result * coordinateB;
        return result;
    }

    public void addMap(int hash, Deck deck){
        this.deckMap.put(hash,deck);
    }

    public Map<Integer, Deck> getHashMap(){
        return this.deckMap;
    }

}
