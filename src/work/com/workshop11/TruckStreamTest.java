package work.com.workshop11;

import java.util.ArrayList;
import java.util.List;
import work.com.workshop11.Q1.Truck;

public class TruckStreamTest {
    public static void main(String[] args) {
        Truck truck = new Truck(1000, 100, 5);
        List<String> logs = new ArrayList<>();
        List<Integer> distanceList = List.of(30, 30, 50);

        truck.addOil(50);
        logs.add(truck.toString());

        truck.moving(50);
        logs.add(truck.toString());

        truck.addWeight(100);
        logs.add(truck.toString());

        truck.moving(30);
        logs.add(truck.toString());

        logs.forEach(System.out::println);

        int totalCost = distanceList.stream().mapToInt(truck::getCost).sum();
        System.out.println("총 요금: " + totalCost + "원");
    }
}
