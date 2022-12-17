package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouseone = new Warehouse(0, 0 );
        Picker pickerone = new Picker(0, warehouseone);
        Courier courierone = new Courier(0, warehouseone);
        businessProcess(pickerone);
        businessProcess(courierone);

        System.out.println(courierone.toString());
        System.out.println(pickerone.toString());


        Warehouse warehousetwo = new Warehouse(0, 0);
        Picker pickertwo = new Picker(0, warehousetwo);
        Courier couriertwo = new Courier(0, warehousetwo);

        pickertwo.doWork();
        int a = pickertwo.getSalary();
        int b = warehousetwo.getPickedOrders();

        System.out.println(a);
        System.out.println(b);
    }

    static void businessProcess(Worker worker) {
        int i = 0;
        while (i < 10000) {
            worker.doWork();
            i++;
        }
        if (i == 10000) {
            worker.bonus();
        }
    }
}

