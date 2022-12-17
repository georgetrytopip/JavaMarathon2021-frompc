package day11.task1;

public class Courier implements Worker {
    private int salary;
    private int isPayed = 0;
    private Warehouse w;

    public Courier(int salary, Warehouse w){
        this.salary = salary;
        this.w = w;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getIsPayed(){
        return this.isPayed;
    }

    public String toString(){
        return salary + "," + isPayed;
    }

    public int doWork(){
        salary = salary + 100;
        w.countDeliveredOrders++;
        return salary;
    }

    public void bonus() {
            if (w.countPickedOrders >= 10000 && isPayed == 0) {
                salary = salary + 50000;
                isPayed = 1;
            } else if (w.countPickedOrders < 10000){
                System.out.println("Bonus ia unreliable right now");
            } else if (isPayed == 1) {
                System.out.println("Bonus has already been paid");
            }
        }
    }


