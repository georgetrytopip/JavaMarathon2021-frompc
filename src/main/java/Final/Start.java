package Final;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws Exception {

        System.out.println("Lets begin our game");
        System.out.println("GameBoard for player A is created");
        GameBoard board1 = new GameBoard();
        board1.setGameBoard();
        System.out.println("GameBoard for player B is created");
        GameBoard board2 = new GameBoard();
        board2.setGameBoard();
        System.out.println("Let's set Lincor ship for player A");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 digit's as coordinates for the lincor");
        String line = scanner.nextLine();
        String [] numbersString = line.split(",");
        int [] intList = new int [numbersString.length];

        int counter = 0;
        for(String integer : numbersString ) {
            intList[counter++] = Integer.parseInt(integer);
        }

        if(counter != 8) {
            System.out.println("You should enter 8 cordinates");
        }

        board1.setLincorOnBoard(intList[0], intList[1], intList[2], intList[3], intList[4], intList[5], intList[6], intList[7]);
        board1.printGameBoard();

        System.out.println("Let's set Cruiser ship for player A");


        Scanner scan = new Scanner(System.in);
        String line2 = scan.nextLine();
        String [] numbersString2 = line2.split(",");
        int [] intList2 = new int [numbersString2.length];

        int counter2 = 0;
        for(String integer : numbersString2 ) {
            intList2[counter2++] = Integer.parseInt(integer);
        }

        if(counter2 != 6) {
            System.out.println("You should enter 6 cordinates");
        }


        board1.setCruiser(intList2[0], intList2[1], intList2[2], intList2[3], intList2[4], intList2[5]);
        board1.printGameBoard();

        System.out.println("Let's set SECOND Cruiser ship for player A");


        Scanner scan2 = new Scanner(System.in);
        String line3 = scan.nextLine();
        String [] numbersString3 = line3.split(",");
        int [] intList3 = new int [numbersString3.length];

        int counter3 = 0;
        for(String integer : numbersString3 ) {
            intList3[counter3++] = Integer.parseInt(integer);
        }

        if(counter2 != 6) {
            System.out.println("You should enter 6 cordinates");
        }


        board1.setCruiser(intList3[0], intList3[1], intList3[2], intList3[3], intList3[4], intList3[5]);
        board1.printGameBoard();



        Scanner scan3 = new Scanner(System.in);
        String line4 = scan3.nextLine();
        String [] numbersString4 = line4.split(",");
        int [] intList4 = new int [numbersString4.length];

        int counter4 = 0;
        for(String integer : numbersString2 ) {
            intList4[counter4++] = Integer.parseInt(integer);
        }

        if(counter2 != 4) {
            System.out.println("You should enter 4 cordinates");
        }


        board1.setDestroyer(intList4[0], intList4[1], intList4[2], intList4[3]);
        board1.printGameBoard();



        System.out.println("All is set for player A");
        System.out.println("Now let's set everything for player B");


        System.out.println("Let's set Lincor ship for player B");
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter 8 digit's as coordinates for the lincor");
        String line5 = scanner5.nextLine();
        String [] numbersString5 = line5.split(",");
        int [] intList5 = new int [numbersString5.length];

        int counter5 = 0;
        for(String integer : numbersString5 ) {
            intList5[counter5++] = Integer.parseInt(integer);
        }

        if(counter5 != 8) {
            System.out.println("You should enter 8 cordinates");
        }

        board2.setLincorOnBoard(intList5[0], intList5[1], intList5[2], intList5[3], intList5[4], intList5[5], intList5[6], intList5[7]);
        board2.printGameBoard();

        System.out.println("Let's set Cruiser ship for player A");


        Scanner scan6 = new Scanner(System.in);
        String line6 = scan.nextLine();
        String [] numbersString6 = line6.split(",");
        int [] intList6 = new int [numbersString6.length];

        int counter6 = 0;
        for(String integer : numbersString2 ) {
            intList6[counter6++] = Integer.parseInt(integer);
        }

        if(counter6 != 6) {
            System.out.println("You should enter 6 cordinates");
        }


        board2.setCruiser(intList6[0], intList6[1], intList6[2], intList6[3], intList6[4], intList6[5]);
        board2.printGameBoard();

        System.out.println("Let's set SECOND Cruiser ship for player A");


        Scanner scan7 = new Scanner(System.in);
        String line7 = scan.nextLine();
        String [] numbersString7 = line7.split(",");
        int [] intList7 = new int [numbersString7.length];

        int counter7 = 0;
        for(String integer : numbersString7 ) {
            intList7[counter7++] = Integer.parseInt(integer);
        }

        if(counter7 != 6) {
            System.out.println("You should enter 6 cordinates");
        }


        board2.setCruiser(intList7[0], intList7[1], intList7[2], intList7[3], intList7[4], intList7[5]);
        board2.printGameBoard();



        Scanner scan8 = new Scanner(System.in);
        String line8 = scan8.nextLine();
        String [] numbersString8 = line8.split(",");
        int [] intList8 = new int [numbersString8.length];

        int counter8 = 0;
        for(String integer : numbersString2 ) {
            intList8[counter8++] = Integer.parseInt(integer);
        }

        if(counter8 != 4) {
            System.out.println("You should enter 4 cordinates");
        }


        board2.setDestroyer(intList8[0], intList8[1], intList8[2], intList8[3]);
        board2.printGameBoard();


        int alfa = 0; // Начальное значение диапазона - "от"
        int beta = 1; // Конечное значение диапазона - "до"

        int random_number1 = alfa + (int) (Math.random() * beta);

        boolean nitro = true;

        if(random_number1 == 0) {
            System.out.println("Player A shoot do the first shot");
            while(nitro){
                Scanner scan123 = new Scanner(System.in);
                System.out.println("Enter coordinates");
                int norma = scan123.nextInt();
                int zeta = scan123.nextInt();
                board2.shotTheShip(norma, zeta);
                if (board2.isBoardDead()) {
                    nitro = false;
                }

                Scanner scan321 = new Scanner(System.in);
                System.out.println("Player B enter coordinates");
                int nihao = scan321.nextInt();
                int chanda = scan321.nextInt();
                board1.shotTheShip(nihao, chanda);
                if (board1.isBoardDead()) {
                    nitro = false;
                }
            }
        } else {
            System.out.println("Player B shoot the first shot");

            //нужно переопределить порядок выстрелов если при рандоме выиграл второй игрок
        }




















    }
}
