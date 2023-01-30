package Final;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets begin our game");
        System.out.println("GameBoard for player A is created");
        GameBoard board1 = new GameBoard();
        System.out.println("GameBoard for player B is created");
        GameBoard board2 = new GameBoard();
        System.out.println("Let's set Lincor ship for player A");
        boolean lincorAcounter = true;

            System.out.println("Enter 8 digit's as coordinates for the lincor");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = scanner.nextInt();
            int f = scanner.nextInt();
            int g = scanner.nextInt();
            int h = scanner.nextInt();

            board1.setLincorOnBoard(a, b, c, d, e, f, g, h);



        board1.printGameBoard();

    }
}
