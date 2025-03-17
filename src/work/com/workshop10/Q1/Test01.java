package work.com.workshop10.Q1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test01 {
	public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("다시 입력하세요");
            return;
        }

        int input;
        try {
            input = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("다시 입력하세요");
            return;
        }

        if (input < 5 || input > 10) {
            System.out.println("다시 입력하세요");
            return;
        }

        List<Integer> numbers = IntStream.rangeClosed(1, input).boxed().collect(Collectors.toList());
        List<String> evenOddList = numbers.stream()
            .map(n -> n + (n % 2 == 0 ? " (짝수)" : " (홀수)"))
            .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        int sum = evenNumbers.stream().mapToInt(Integer::intValue).sum();
        int max = evenNumbers.stream().max(Integer::compare).orElse(0);
        int min = evenNumbers.stream().min(Integer::compare).orElse(0);

        System.out.println("1부터 " + input + "까지의 숫자 : " + numbers);
        System.out.println();
        System.out.println("짝수 판별 : " + evenOddList);
        System.out.println();
        System.out.println("입력 값 : " + input);
        System.out.println("짝수 리스트 : " + evenNumbers);
        System.out.println("짝수 개수 : " + evenNumbers.size());
        System.out.println("짝수 중 가장 큰 값 : " + max);
        System.out.println("짝수 중 가장 작은 값 : " + min);
        System.out.println("짝수의 합 : " + sum);
    }

}
