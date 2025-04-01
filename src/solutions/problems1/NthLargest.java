package solutions.problems1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class NthLargest {
    public static void nth() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 표의 모든 값
        for (int i = 0; i < N; i++) {
            // 한 줄씩 읽고 공백 기준으로 나눔
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(line[j]);

                // 우선순위 큐에 추가
                pq.offer(num);

                // N개의 값만 유지
                if (pq.size() > N) {
                    pq.poll();
                }
            }
        }
        System.out.println(pq.peek());
    }
}
