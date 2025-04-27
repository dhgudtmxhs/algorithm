package solutions.string;

import java.util.HashMap;
import java.util.Map;

public class KakaoMBTISurvey {

    public static String Solution(String[] survey, int[] choices) {

        // 카카오 성격 유형 검사지 만들기
        // 성격 유형 : 4개지표
        // 1. R,T
        // 2. C,F
        // 3. J,M
        // 4. A,N
        // 총 성격 유형 : 16가지(2x2x2x2)
        // 성격 유형 ex : RFMN, TCMA, ...
        // 검사지 질문 : n개
        // 질문별 선택지 : 7개
        // 매비, 비, 약비, 모, 약동, 동, 매동
        // 모 = 0, 비동 = 네오형, 동 = 어피치형
        // 질문에 따라 비동의, 동의가 둘다있을 수 있음
        // -> 어떤 질문에서는 동의가 네오형 점수고, 어떤 질문에서는 비동의가 네오형 점수라는것
        // 검사 결과 : 모든 질문의 성격유형을 더해서 각 지표에서 더 높은 점수
        //           근데 점수가 같다면 사전순으로 빠른 성격 유형으로 침
        // 즉 1~4 지표를 돌면서, 원소는 무조건 지표 분류대로옴. 근데 ["RT"], ["TR"] 순서변경은 가능
        // 앞의 순서가 비동의임 - RT면 비동의일시 R형으로 점수가 쌓이고 T면 비동의시 T형으로 점수가 쌓임. 동의시에는 그 반대
        // 초이스는 1~7 이고, 1 = 매우비동의 ~ 7 = 매우 동의

        // 점수 저장용 맵 초기화
        Map<Character, Integer> score = new HashMap<>();
        for (char c : new char[]{'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}) {
            score.put(c, 0);
        }

        // 설문과 선택지 순회하며 점수 누적
        for(int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];
            if (choice == 4) continue; // 0

            int diff = Math.abs(choice - 4);
            char key = (choice < 4) ? s.charAt(0) : s.charAt(1);
            score.put(key, score.get(key) + diff);
        }

        StringBuilder answer = new StringBuilder();
        char[][] pairs = {
                {'R', 'T'},
                {'C', 'F'},
                {'J', 'M'},
                {'A', 'N'}
        };

        for(char[] p : pairs) {
            char first = p[0];
            char second = p[1];
            int s1 = score.get(first);
            int s2 = score.get(second);
            answer.append(s1 >= s2 ? first : second);
        }

        return answer.toString();
    }
}
