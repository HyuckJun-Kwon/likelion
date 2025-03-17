package work.com.workshop10.Q2;

import java.util.stream.IntStream;

public class MonthsTest {

	public static void main(String args[]) {
        if (args.length == 0 || !args[0].matches("\\d+")) {
            System.out.println("입력된 값이 잘못 되었습니다");
            return;
        }

        int month = Integer.parseInt(args[0]);

        
        if (IntStream.rangeClosed(1, 12).noneMatch(n -> n == month)) {
            System.out.println("입력된 값이 잘못 되었습니다");
            return;
        }

        Months months = new Months();
        int days = months.getDays(month);

        System.out.printf("월을 입력하세요 (1~12) : %d\n", month);
        System.out.printf("입력받은 월 : %02d월\n", month);
        System.out.println("짝수/홀수 여부 : " + (month % 2 == 0 ? "짝수월" : "홀수월"));
        System.out.printf("마지막 일자 : %d일\n", days);
    }

}
