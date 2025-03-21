package codeTest.work20250321;

public class Q1_388351 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int[] endTimes = new int[schedules.length];

        for (int i = 0; i < schedules.length; i++) {
            int h = schedules[i] / 100;
            int m = schedules[i] % 100;
            int newTime = (h * 100 + m + 10);
            if (newTime % 100 >= 60) {
                newTime += 40;
            }
            endTimes[i] = newTime;
        }

        for (int i = 0; i < timelogs.length; i++) {
            boolean isGift = true;
            for (int j = 0; j < 7; j++) {
                int actualDay = (startday + j - 1) % 7;
                if (actualDay == 5 || actualDay == 6) {
                    continue;
                }

                if (timelogs[i][j] > endTimes[i]) {
                    isGift = false;
                    break;
                }
            }
            if (isGift) {
                answer++;
            }
        }
        return answer;
    }
}

