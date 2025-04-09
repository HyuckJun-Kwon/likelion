package work.com.workshop13.Q2;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
    private ArrayList<Integer> list;

    public MakeList() {
        this.list = new ArrayList<>();
    }

    public void makeArrayList(int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(10) + 10);
        }
    }

    public double getAverage() {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
}