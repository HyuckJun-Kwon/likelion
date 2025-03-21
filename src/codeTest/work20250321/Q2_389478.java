package codeTest.work20250321;

public class Q2_389478 {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int row = (num - 1) / w;
        int col = (row % 2 == 0) ? (num - 1) % w : (w - 1 - (num - 1) % w);

        for (; row < (n + w - 1) / w; row++) {
            int onBox = (row % 2 == 0) ? col + row * w : (w - 1 - col) + row * w;
            if (onBox < n) answer++;
        }

        return answer;
    }
}
