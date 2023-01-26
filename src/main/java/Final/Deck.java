package Final;

public class Deck {
    private boolean isAlive = true;


    public boolean getAlive(){
        return this.isAlive;
    } //метод получения статуса палубы (жива она собственно или нет)

    public void kill(){
        this.isAlive = false;
    } //метод убития палубы
}
