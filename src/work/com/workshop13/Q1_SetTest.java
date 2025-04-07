package work.com.workshop13;

import java.util.HashSet;
import java.util.Set;

public class Q1_SetTest {

	public static void main(String[] args) {
        String input = args[0];
        Set<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }
        System.out.println(charSet);

	}

}
