package work.com.workshop07.Q6;

public class PlaneTest {

    public static void main(String[] args) {
        Plane p1 = new Airplane("L747", 1000);
        Plane p2 = new Cargoplane("C40", 1000);
        Plane[] planes = { p1, p2 };

        printStatus("초기 상태", planes);

        p1.flight(100);
        p2.flight(100);
        printStatus("100 운항 후", planes);

        p1.refuel(200);
        p2.refuel(200);
        printStatus("200 주유 후", planes);
    }

    private static void printStatus(String message, Plane[] planes) {
        System.out.println("\n" + message);
        System.out.println("Plane     fuelSize");
        System.out.println("---------------------");
        for (Plane p : planes) {
            System.out.printf("%s     %d\n", p.getPlaneName(), p.getFuelSize());
        }
    }
}