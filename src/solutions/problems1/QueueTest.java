package solutions.problems1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void testBuffered(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = -1;

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int x = Integer.parseInt(command.substring(5));
                queue.offer(x);
                last = x;
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.poll() + "\n");
                }
            } else if (command.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (command.equals("empty")) {
                bw.write((queue.isEmpty() ? 1 : 0) + "\n");
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue.peek() + "\n");
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(last + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}


