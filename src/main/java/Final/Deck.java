package Final;

public class Deck {
    private boolean isAlive = true;

    int coordinate1;
    int coordinate2;


    public boolean getAlive(){
        return this.isAlive;
    } //метод получения статуса палубы (жива она собственно или нет)

    public void setCoordinates(int coordinate1, int coordinate2){
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }

    public int getCoordinate1(){
        return this.coordinate1;
    }

    public int getCoordinate2(){
        return this.coordinate2;
    }




    public void kill(){
        this.isAlive = false;
    } //метод убития палубы
}
