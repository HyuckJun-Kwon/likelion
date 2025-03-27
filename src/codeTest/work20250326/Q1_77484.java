package codeTest.work20250326;

public class Q1_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int z = 0;
        int s = 0;
        for(int n : lottos) {
            if(n == 0) {
                z++;
                continue;
            }
            for(int win : win_nums) {
                if(n == win) {
                    s++;
                    break;
                }
            }
        }
        answer[0] = Math.min(7 - z - s, 6);
        answer[1] = Math.min(7 - s, 6);
        return answer;
    }
}
