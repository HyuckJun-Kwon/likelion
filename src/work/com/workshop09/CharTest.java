package work.com.workshop09;

import java.util.stream.IntStream;

public class CharTest {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("문자열을 입력하세요.");
            return;
        }

        String input = args[0].toUpperCase();

        String reversed = IntStream.range(0, input.length())
        		.mapToObj(i -> String.valueOf(input.charAt(input.length() - 1 - i)))
        		.reduce("", (a, b) -> a + b);

        System.out.println(reversed);
    }
}
