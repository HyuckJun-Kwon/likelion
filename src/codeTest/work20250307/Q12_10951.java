package codeTest.work20250307;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q12_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> sum = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sum.add(i + j);
        }

        br.close();

        for (int num : sum) {
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
}

