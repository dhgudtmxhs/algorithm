package solutions.problems1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class ComboMasterIMS2 {

    public static void combo() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String command = br.readLine();
        int count = 0;

        Queue<Character>queue = new LinkedList<Character>();

        for (int i = 0; i < n; i++){

            char skill = command.charAt(i);

            if('1' <= skill && skill <= '9'){ // 1부터 9는 조건 없이 증가
                count++;
            }

            else if(skill == 'L' || skill == 'S'){ // 사전기술은 큐에 추가
                queue.add(skill);
            }

            else if(skill == 'R') {
                if (queue.contains('L')) { // L-R 연계
                    queue.remove('L'); // 큐에서 첫 번째 'L'을 제거
                    count++;
                } else {
                    break; // L 없이 R이 오면 오류
                }
            }

            else if(skill == 'K') {
                if (queue.contains('S')) { // S-K 연계
                    queue.remove('S'); // 큐에서 첫 번째 'S'를 제거
                    count++;
                } else {
                    break; // S 없이 K가 오면 오류
                }
            }

        }

        bw.write(String.valueOf(count));
        bw.flush();
    }

}
