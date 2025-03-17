package work.com.workshop10.Q2;

import java.util.HashMap;
import java.util.Map;

public class Months {
	private static final Map<Integer, Integer> monthDays = new HashMap<>();

    static {
        monthDays.put(1, 31);
        monthDays.put(2, 28);
        monthDays.put(3, 31);
        monthDays.put(4, 30);
        monthDays.put(5, 31);
        monthDays.put(6, 30);
        monthDays.put(7, 31);
        monthDays.put(8, 31);
        monthDays.put(9, 30);
        monthDays.put(10, 31);
        monthDays.put(11, 30);
        monthDays.put(12, 31);
    }

	    public int getDays(int month) {
	        return monthDays.getOrDefault(month, 0);
	    }

}
