package work.com.workshop08;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new L3("L3", "1500", 50, 25, 0);
		Car c2 = new L5("L5", "2000", 70, 35, 0);
		Car[] cars = {c1, c2};
		
		printStatus("초기 상태", cars);

        System.out.println("\n25 주유");
        for (Car c : cars) {
            c.setOil(25);
        }
        printStatus("주유 후", cars);

        System.out.println("\n80 주행");
        for (Car c : cars) {
            c.go(80);
            c.setDistance(80);
        }
        printStatus("주행 후", cars);
    }

    private static void printStatus(String message, Car[] cars) {
        System.out.println("\n" + message);
        System.out.println("vehicleName     engineSize     oilTank     oilSize     distance     temperature");
        System.out.println("----------------------------------------------------------------------------------");
        for (Car c : cars) {
            int tempGage = 0;
            if (c instanceof L3) {
                tempGage = ((L3) c).getTempGage();
            } else if (c instanceof L5) {
                tempGage = ((L5) c).getTempGage();
            }
            System.out.printf("%5s %15s %12d %12d %12d %12d\n", 
                c.getName(), c.getEngine(), c.getOilTank(), c.getOilSize(), c.getDistance(), tempGage);
        }
    }
}