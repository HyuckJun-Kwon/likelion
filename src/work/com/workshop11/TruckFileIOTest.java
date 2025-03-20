package work.com.workshop11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import work.com.workshop11.Q1.Truck;

public class TruckFileIOTest {
    public static void main(String[] args) throws IOException {
        Truck truck = new Truck(1000, 100, 5);
        truck.addOil(50);
        truck.moving(50);
        truck.addWeight(100);
        truck.moving(30);

        String truckState = truck.toString();
        Path filePath = Path.of("truck_state.txt");
        Files.writeString(filePath, truckState);

        String loadedState = Files.readString(filePath);
        System.out.println("파일에서 읽은 Truck 상태: \n" + loadedState);
    }
}
