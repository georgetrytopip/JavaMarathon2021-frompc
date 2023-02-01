package Final;


import java.util.List;
import java.util.Map;

public class GameBoard {
    private Ship[][] warships;
    private int boardLengthHorizontal = 10;

    private int boardLengthVertical = 10;


    public boolean isBoardDead(){
        boolean counter = false;
        for(int i = 0; i < boardLengthHorizontal; i++) {
            for (int j = 0; j < boardLengthVertical; j++) {
                if (this.warships[i][j].getShipAlive()) {
                    counter = false;
                } else if (!this.warships[i][j].getShipAlive()) {
                    counter = true;
                }
            }
        }
        return counter;
    }




    public int setBoardLengthHorizontal(int boardLengthHorizontal) {
        this.boardLengthHorizontal = boardLengthHorizontal;
        return boardLengthHorizontal;
    }

    public int setBoardLengthVertical(int boardLengthVertical) {
        this.boardLengthVertical = boardLengthVertical;
        return boardLengthVertical;
    }


    //ставим корабль на поле
    public void setLincorOnBoard(int y1, int x1, int y2, int x2, int y3, int x3, int y4, int x4) throws Exception {
        if (y1 != y4) {
            throw new Exception("Incorrect coordinates for ship");
        } else if (y1 == 11 || y2 == 11 || y3 == 11 || x1 < 0 || x2 < 0 || x3 < 0 || x4 < 0 || y1 < 0 || y2 < 0 || y3 < 0) {
            throw new Exception("Incorrect coordinates");
        } else if (!checkAvailability(y1, x1) || !checkAvailability(y2, x2) || !checkAvailability(y3, x3) || !checkAvailability(y4, x4)) {
            throw new Exception("The other ship nearby");
        } else {
            Ship a = new Ship(4, "l");
            this.warships[y1][x1] = a;
            this.warships[y2][x2] = a;
            this.warships[y3][x3] = a;
            this.warships[y4][x4] = a;
            Deck deck1 = new Deck();
            deck1.setCoordinates(y1, x1);
            a.addMap(a.setHash(y1, x1), deck1);
            Deck deck2 = new Deck();
            deck2.setCoordinates(y2, x2);
            a.addMap(a.setHash(y2, x2), deck2);
            Deck deck3 = new Deck();
            deck3.setCoordinates(y3, x3);
            a.addMap(a.setHash(y3, x3), deck3);
            Deck deck4 = new Deck();
            deck4.setCoordinates(y4, x4);
            a.addMap(a.setHash(y4, x4), deck4);
            a.setDeckList().add(deck1);
            a.setDeckList().add(deck2);
            a.setDeckList().add(deck3);
            a.setDeckList().add(deck4);
        }
    }


    public void setCruiser(int y1, int x1, int y2, int x2, int y3, int x3) throws Exception {
        if (y1 > 10 || y2 > 10 || x1 < 0 || x2 < 0 || x3 > 10 || y1 < 0 || y2 < 0) {
            throw new Exception("Incorrect coordinates");
        } else if (!checkAvailability(y1, x1) || !checkAvailability(y2, x2) || !checkAvailability(y3, x3)) {
            throw new Exception("The other ship nearby");
        } else {
            Ship b = new Ship(3, "c");
            this.warships[y1][x1] = b;
            this.warships[y2][x2] = b;
            this.warships[y3][x3] = b;
            Deck deck1 = new Deck();
            deck1.setCoordinates(y1, x1);
            b.addMap(b.setHash(y1, x1), deck1);
            Deck deck2 = new Deck();
            deck2.setCoordinates(y2, x2);
            b.addMap(b.setHash(y2, x2), deck2);
            Deck deck3 = new Deck();
            deck3.setCoordinates(y3, x3);
            b.addMap(b.setHash(y3, x3), deck3);
            Deck deck4 = new Deck();
            b.setDeckList().add(deck1);
            b.setDeckList().add(deck2);
            b.setDeckList().add(deck3);

        }
    }


    public void setDestroyer(int y1, int x1, int y2, int x2) throws Exception {
        if (y1 != y2) {
            throw new Exception("Incorrect coordinates for ship");
        } else if (y1 > 10 || y2 > 9 || x1 < 0 || x2 < 0 || y1 < 0) {
            throw new Exception("Incorrect coordinates");
        } else if (!checkAvailability(y1, x1) || !checkAvailability(y2, x2)) {
            throw new Exception("The other ship nearby");
        } else {
            Ship c = new Ship(2, "d");
            this.warships[y1][x1] = c;
            this.warships[y2][x2] = c;
            Deck deck1 = new Deck();
            deck1.setCoordinates(y1, x1);
            c.addMap(c.setHash(y1, x1), deck1);
            Deck deck2 = new Deck();
            deck2.setCoordinates(y2, x2);
            c.addMap(c.setHash(y2, x2), deck2);
            Deck deck4 = new Deck();
            c.setDeckList().add(deck1);
            c.setDeckList().add(deck2);
        }
    }

    public void setCater(int y1, int x1) throws Exception {
        if (y1 > 10 || x1 < 0 || y1 < 0) {
            throw new Exception("Incorrect coordinates");
        } else if (!checkAvailability(y1, x1)) {
            throw new Exception("The other ship nearby");
        } else {
            Ship d = new Ship(1, "c");
            this.warships[y1][x1] = d;
            Deck deck1 = new Deck();
            deck1.setCoordinates(y1, x1);
            d.addMap(d.setHash(y1, x1), deck1);
            d.setDeckList().add(deck1);
        }
    }


    //задаем пустое поле в конструкторе
    public void setGameBoard() {
        this.warships = new Ship[boardLengthHorizontal][boardLengthVertical];
        for (int i = 0; i < boardLengthHorizontal; i++) {
            for (int j = 0; j < boardLengthVertical; j++) {
                this.warships[i][j] = new Ship(0, "-");
            }
        }
    }

    public void printGameBoard() {
        System.out.println();
        for (int i = 0; i < warships.length; i++) {
            for (int j = 0; j < warships[i].length; j++) {
                System.out.print(this.warships[i][j].getShipName());
            }
            System.out.println();
        }
    }

    public boolean checkAvailability(int j1, int f1) {
        boolean yesNo = true;
        if (warships[j1][f1].getShipLength() != 0) {
            yesNo = false;
        }
        if (j1 == 1 & warships[j1][f1].getShipLength() == 0) {
            yesNo = true;
        } else if (f1 == 1 & warships[j1][f1].getShipLength() == 0) {
            yesNo = true;
        } else if (f1 == 9 || j1 == 9) {
            int r = j1 - 1;
            int m = f1 - 1;
            if (warships[r][m].getShipLength() != 0) {
                yesNo = false;
            }
        } else {

            if (j1 == 0 || f1 == 0) {
                int a = j1;
                int b = f1;
                int c = j1 + 1;
                int d = f1 + 1;
                if (warships[a][b].getShipLength() != 0 ||
                        warships[c][d].getShipLength() != 0) {
                    yesNo = false;
                }
            } else {
                int a = j1 - 1;
                int b = f1 - 1;
                int c = j1 + 1;
                int d = f1 + 1;
                if (warships[a][b].getShipLength() != 0 ||
                        warships[c][d].getShipLength() != 0) {
                    yesNo = false;
                }
            }
        }
        return yesNo;
    }

    public void shotTheShip(int coordinateA, int coordinateB) {
        if (warships[coordinateA][coordinateB].getShipLength() == 0) {
            System.out.println("Miss!");
        } else {
            int a = warships[coordinateA][coordinateB].setHash(coordinateA, coordinateB);
            for (Map.Entry<Integer, Deck> entry : warships[coordinateA][coordinateB].getHashMap().entrySet()) {
                if (entry.getKey() == setHashCoordinates(coordinateA, coordinateB)) {
                    boolean killed = entry.getValue().getAlive();
                    if (killed) {
                        entry.getValue().kill();
                        int counter = 0;
                        for (Deck deck : warships[coordinateA][coordinateB].getDecks()) {
                            if (deck.getAlive()) {
                                counter++;
                            }
                        }
                        if (counter == 0) {
                            System.out.println("Ship is killed");
                            warships[coordinateA][coordinateB].setShipDead();

                        } else {
                            System.out.println("Ship is damaged");
                        }
                    } else {
                        System.out.println("It's already killed");
                    }
                }
            }
        }
    }

    public int setHashCoordinates(int coordinateA, int coordinateB){
        int result = coordinateA;
        result = 31 * result * coordinateB;
        return result;
    }
}



