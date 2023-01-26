package Final;

public enum Ship {

    LINCOR(4, "l"),
    KRUISER(3, "k"),
    DESTROYER(2, "d"),
    BOAT(1, "b"),
    EMPTY(0, "-");


    private int deckLength;
    private String shipName;

    Ship(int deckLength, String shipName) {
        this.deckLength = deckLength;
        this.shipName = shipName;
    }

    public String getShipName(){
        return this.shipName;
    }

    public int getShipLength(){
        return this.deckLength;
    }
}
