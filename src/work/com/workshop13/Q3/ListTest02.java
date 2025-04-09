package work.com.workshop13.Q3;

public class ListTest02 {
	public static void main(String[] args) {
        int[] array = {3, 4, 2, 5, 2, 3, 6, 7, 5, 7, 9};
        ConvertList convertList = new ConvertList();
        for (int num : convertList.convertList(array)) {
            System.out.println(num);
        }
	}
}
