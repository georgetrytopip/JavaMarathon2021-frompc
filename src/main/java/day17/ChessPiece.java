package day17;

public enum ChessPiece {
    KING_WHITE(100, "king_white"),
    KING_BLACK(100, "king_black"), QUEEN_WHITE(9, "queen_white"),
    QUEEN_BLACK(9, "queen_black"), ROOK_WHITE(5, "rook_white"),
    ROOK_BLACK(5, "rook_black"), BISHOP_WHITE((int)3.5, "bishop_white"),
    BISHOP_BLACK((int)3.5, "bishop_black"), KNIGHT_WHITE(3, "knight_white"),
    KNIGHT_BLACK(3, "knight_black"), PAWN_WHITE(1, "pawn_white"),
    PAWN_BLACK(1, "pawn_black"), EMPTY (-1, "_");

    private int value;
    private String symbol;
    ChessPiece(int value, String symbol){
        this.value = value;
        this.symbol = symbol;
    }

    public String getSymbol(){
        return this.symbol;
    }

}
