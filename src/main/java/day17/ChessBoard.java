package day17;

public class ChessBoard {
    private ChessPiece[][] figures;

    ChessBoard(ChessPiece[][] figures) {
        this.figures = figures;
    }

    public void getChessBoard() {
        for (int i = 0; i < this.figures.length; i++) {
            for (int j = 0; j < this.figures[i].length; j++) {
                System.out.print(this.figures[i][j].getSymbol());
            }
            System.out.println();
        }
    }
}
