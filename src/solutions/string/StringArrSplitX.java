package solutions.string;

import java.util.Arrays;

public class StringArrSplitX {

    public static int[] solution(String myString) {
        // split("x", limit) 동작 정리:
        // - limit > 0 : 최대 (limit-1)번 분리, 결과 배열 길이 ≤ limit, 끝 빈 문자열도 보존
        //     → limit ≥ (구분자 개수 + 1) 이면 모든 조각+빈문자열 포함
        // - limit = 0 : 가능한 많이 분리, 결과 배열 길이 무제한, 마지막 빈 문자열만 제거
        // - limit < 0 : 가능한 많이 분리, 결과 배열 길이 무제한, 모든 빈 문자열 보존
        // 예시:
        //   split("x", -1)  → trailing empty 포함 (["o","oo","o","","o",""])
        //   split("x")      → split("x", 0) 과 같음, trailing empty 하나만 제거 (["o","oo","o","","o"])
        //   split("x", 1)   → 분리 안 함, ["oxooxoxxox"] (원본 전체)
        //   split("x", myString.length()) → 충분히 큰 limit, -1과 유사하게 동작

        // 'x'를 기준으로 분리, limit = -1로 trailing empty 보존
        String[] parts = myString.split("x", -1);

        int[] answer = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            answer[i] = parts[i].length();
        }

        return answer;
    }

    public String[] solution2(String my_string) {
        //  \\s : 공백 문자(스페이스, 탭, 개행 등) \\s+ 한글자 이상
        return my_string.trim().split(" +");
    }

    public String[] solution3(String[] strArr) {
        // Java 배열(T[])은 크기가 고정(fixed-size) 되어 있어서, 요소 하나만 “삭제”하는 메서드는 없다.
        // List(Collection)으로 변경해 처리 후 다시 배열로 반환한다.
        return Arrays.stream(strArr)
                .filter(s -> !s.contains("ad"))
                .toArray(String[]::new);
    }

}
