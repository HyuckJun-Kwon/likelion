package work.com.workshop10.Q3;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
	private List<Coffee> coffeeList = new ArrayList<>();

    public void setCoffee(Coffee coffee) {
        if (coffeeList.size() < 3) {
            coffeeList.add(coffee);
        } else {
            System.out.println("더 이상 저장할 수 없습니다");
        }
    }

    public int totalPrice() {
        return coffeeList.stream().mapToInt(Coffee::getPrice).sum();
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

}
