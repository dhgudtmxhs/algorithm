package solutions.problems1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCard {

    public static void card1() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        StringBuilder result = new StringBuilder();

        while (queue.size() > 1) {
            // 맨 위 카드 버림
            result.append(queue.poll()).append(" ");
            // 다음 맨 위 카드 맨 아래로 이동
            queue.offer(queue.poll());
        }

        // 마지막 카드 추가
        result.append(queue.poll());

        bw.write(result.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
