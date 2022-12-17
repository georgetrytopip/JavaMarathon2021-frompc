package day7;



public class Task2 {
    public static void main(String[] args) {


        Player player1 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player2 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player3 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player4 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player5 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player6 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player7 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player8 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player9 = new Player((int)(Math.random() * (100 - 90)) + 90);
        Player player10 = new Player((int)(Math.random() * (100 - 90)) + 90);

        int j = Player.getCountPlayers();

        System.out.println("Количество игроков на поле =" + j);

        while (player1.getStamina() > 0){
            player1.run();
        }

        int b = player1.getStamina();
        System.out.println(b);

        int z = player1.getCountPlayers();
        System.out.println(z);

    }
}
