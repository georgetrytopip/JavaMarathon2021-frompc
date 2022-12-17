package day11.task1;

public class Warehouse {
    int countPickedOrders;
    int countDeliveredOrders;

    public Warehouse(int countPickedOrders,  int countDeliveredOrders){
        this.countPickedOrders = countPickedOrders;
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public int getPickedOrders(){
        return countPickedOrders;
    }

    public int getDeliveredOrders(){
        return countDeliveredOrders;
    }

    public String toString(){
        return countPickedOrders + "," + countDeliveredOrders;
    }
}
