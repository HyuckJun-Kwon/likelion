package work.com.workshop13.q2;

import java.util.ArrayList;

public class ListTest01 {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        MakeList makeList = new MakeList();
        makeList.makeArrayList(size);
        ArrayList<Integer> list = makeList.getList();
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("평균 : " + makeList.getAverage());
    }
}
