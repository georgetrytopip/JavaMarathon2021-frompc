package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static day17.ChessPiece.PAWN_BLACK;
import static day17.ChessPiece.PAWN_WHITE;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chesses = new ArrayList<>(Arrays.asList());

        int counter = 0;

        while(counter < 4){
            chesses.add(ChessPiece.PAWN_WHITE);
            chesses.add(ChessPiece.PAWN_BLACK);
            counter++;
        }

        for(ChessPiece piece : chesses) {
            System.out.print(piece.getSymbol() + " ");
        }

    }
}