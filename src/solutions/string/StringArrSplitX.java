package solutions.string;

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
}
