package codeTest.work20250331;

import java.util.HashMap;

public class Q1_258712 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] given = new int[friends.length][friends.length];
        HashMap<String, Integer> name = new HashMap<>();
        int[] present = new int[friends.length];
        for(int i = 0; i < friends.length; i++) {
            name.put(friends[i], i);
        }

        for(int i = 0; i < gifts.length; i++) {
            String[] names = gifts[i].split(" ");
            given[name.get(names[0])][name.get(names[1])]++;
            present[name.get(names[0])]++;
            present[name.get(names[1])]--;
        }

        int[] nextReceive = new int[friends.length];

        for(int i = 0; i < friends.length; i++) {
            for(int j = i + 1; j < friends.length; j++) {
                if(given[i][j] > given[j][i])
                    nextReceive[i]++;
                else if(given[i][j] < given[j][i])
                    nextReceive[j]++;
                else {
                    if(present[i] > present[j])
                        nextReceive[i]++;
                    else if(present[i] < present[j])
                        nextReceive[j]++;
                }
            }
        }

        int max = 0;
        for(int i = 0; i < nextReceive.length; i++) {
            if(nextReceive[i] > max)
                max = nextReceive[i];
        }

        answer = max;
        return answer;
    }
}
