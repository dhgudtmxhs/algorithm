package solutions.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StringAnalysis {

    public static void analysis() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int lowerCase = 0;
            int upperCase = 0;
            int number = 0;
            int blank = 0;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isLowerCase(c)) {
                    lowerCase++;
                } else if (Character.isUpperCase(c)) {
                    upperCase++;
                } else if (Character.isDigit(c)) {
                    number++;
                } else if (Character.isWhitespace(c)) {
                    blank++;
                }
            }
            System.out.println(lowerCase + " " + upperCase + " " + number + " " + blank);
        }
    }

    public static void cmd() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int len = arr[0].length();
        StringBuilder sbPattern = new StringBuilder();

        for (int j = 0; j < len; j++) {
            char c = arr[0].charAt(j);
            boolean same = true;

            for (int i = 1; i < n; i++) {
                if (j >= arr[i].length() || arr[i].charAt(j) != c) {
                    same = false;
                    break;
                }
            }
            sbPattern.append(same ? c : '?');
        }

        System.out.println(sbPattern.toString());
    }

    public static void factorial() throws IOException {

        // 0! = 1 빈 곱(아무 수를 곱하지 않는 경우)은 항등원 1
        // 1! = 1
        // !0 = 1 !false = true
        // !1 = 0 !true = false

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            int frontExclamationMarkCount = 0;
            int backExclamationMarkCount = 0;
            boolean numberFound = false;
            int number = 0;
            String line = br.readLine();

            for(int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);

                if(!numberFound) {

                    if(ch == '!') {
                        frontExclamationMarkCount++;
                    } else {
                        number = ch - '0';
                        numberFound = true;
                    }

                }
                else {
                    backExclamationMarkCount++;
                }

            }

            if(backExclamationMarkCount > 0) {
                number = 1;
            }

            if(frontExclamationMarkCount > 0) {
                for(int k = 0; k < frontExclamationMarkCount; k++) {
                    if(number == 1) {
                        number = 0;
                    } else {
                        number = 1;
                    }
                }
            }
            System.out.println(number);
        }

    }

    public static void factorialRefactor() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String line = br.readLine();
            int idx = 0;

            // 앞쪽 느낌표 개수 세기
            while (idx < line.length() && line.charAt(idx) == '!') {
                idx++;
            }
            int frontExclamationCount = idx;

            // 그 다음 자리의 숫자 읽기
            int number = line.charAt(idx) - '0';
            idx++;

            // 숫자 뒤에 느낌표가 있다면 결과를 1로 고정
            if (idx < line.length()) {
                number = 1;
            }

            // 앞쪽 느낌표의 개수가 홀수이면 결과 반전 (0 -> 1, 1 -> 0)
            if (frontExclamationCount % 2 == 1) {
                number = 1 - number;
            }

            System.out.println(number);
        }
    }

}
