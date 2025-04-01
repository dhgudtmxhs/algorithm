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

}
