package Final;

public class GameBoard {
    private Ship[][] warships;
    private int boardLengthHorizontal;
    private int boardLengthVertical;

    public int setBoardLengthHorizontal(int boardLengthHorizontal){
        this.boardLengthHorizontal = boardLengthHorizontal;
        return boardLengthHorizontal;
    }

    public int setBoardLengthVertical(int boardLengthVertical){
        this.boardLengthVertical = boardLengthVertical;
        return boardLengthVertical;
    }


    //ставим корабль на поле
    public void setShipOnBoard(String type, int y1, int x1, int y2, int x2) throws Exception {
        if (type.equals("l")) {
            Ship newShip = Ship.LINCOR;
            if (y1 < 1 || x1 < 1 || y2 < 1 || x2 < 1 || y1 > boardLengthVertical
                    || x1 > boardLengthHorizontal || y2 > boardLengthVertical || x2 > boardLengthHorizontal) {
                throw new Exception("Out of bound");
            } else if (y1 - y2 != 3 || y2 - y1 != 3 || x1 - x2 != 3 || x2-x1 != 3) {
                throw new Exception("Incorrect coordinates");
            } else {
                for(int i = 0; i < warships.length; i++) {
                    for (int j = 0; j < warships[i].length; j++) {
                        if(this.warships[y1][x1].getShipLength() != 0 ||
                            this.warships[y2][x2].getShipLength() != 0 ||
                                this.warships[y1+1][x1+1].getShipLength() != 0 ||
                                    this.warships[y2+1][x2+1].getShipLength() != 0 ||
                                        this.warships [y1-1][x1 - 1].getShipLength() != 0 ||
                                            this.warships [y2-1][x2-1].getShipLength() != 0){
                            throw new Exception("Ship couldn't be placed here");
                        } else {
                            // тут я хочу устанавливать корабль
                        }

                        }
                        }









        }
    }

    }



            public Ship getShipOnBoard(int y, int x){
                return this.warships[x][y].getShipLength();
            }


    //задаем пустое поле в конструкторе
    GameBoard(){
        for(int i = 0; i < boardLengthHorizontal; i++) {
            for (int j = 0; j < boardLengthVertical; j++) {
                this.warships[i][j] = Ship.EMPTY;
            }
        }
    }

    public void printGameBoard(){
        for(int i = 0; i < warships.length; i++) {
            for (int j = 0; j < warships[i].length; j++) {
                System.out.print(this.warships[i][j].getShipName());
            }
            System.out.println();
        }
    }
}


