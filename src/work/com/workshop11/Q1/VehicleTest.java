package work.com.workshop11.Q1;

public class VehicleTest {
    public static void main(String[] args) {
        Truck truck = new Truck(1000, 100, 5);
        System.out.println("========================");
        System.out.println(truck);

        truck.addOil(50);
        System.out.println("50L 주유 후\n" + truck);

        truck.moving(50);
        System.out.println("50Km 주행 후\n" + truck);

        truck.addWeight(100);
        System.out.println("100Kg 적재 후\n" + truck);

        truck.moving(30);
        System.out.println("30Km 주행 후\n" + truck);

        System.out.println("요금 : " + truck.getCost(30) + "원");
    }
}
