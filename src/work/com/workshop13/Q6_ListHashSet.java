package work.com.workshop13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Q6_ListHashSet {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int number = rand.nextInt(10) + 1;
            list.add(number);
            set.add(number);
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(set);
    }
}
