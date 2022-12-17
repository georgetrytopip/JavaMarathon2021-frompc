package day7;

public class Player {
    private int Stamina;
    private static final int max_stamina = 100;
    private static final int min_stamina = 0;
    private static int countPlayers = 0;


    Player(int Stamina) {
        this.Stamina = Stamina;

        while (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina(){
        return Stamina;
    }

    public static int getCountPlayers(){
        return countPlayers;
    }

    public  void run() {
        Stamina--;
        if (Stamina == 0) {
            countPlayers--;
        }
    }

    public void info(){
        if (countPlayers <= 6) {
            System.out.println("Teams are not full");
        } else {
            System.out.println("Teams are fully equipped");
        }
    }
}
