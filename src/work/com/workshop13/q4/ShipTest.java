package work.com.workshop13.q4;

import java.util.ArrayList;

public class ShipTest {
    public static void main(String[] args) {
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(new Boat("Boat01", 500));
        ships.add(new Cruise("Cruise01", 1000));

        printShipInfo(ships);

        System.out.println("\n10운항");
        for (Ship ship : ships) {
            ship.sail(10);
        }
        printShipInfo(ships);

        System.out.println("\n50 주유");
        for (Ship ship : ships) {
            ship.refuel(50);
        }
        printShipInfo(ships);
    }

    private static void printShipInfo(ArrayList<Ship> ships) {
        System.out.println("shipName\tfuelTank");
        System.out.println("-----------------------------");
        for (Ship ship : ships) {
            System.out.println(ship.getShipName() + "         " + ship.getFuelTank());
        }
    }
}
