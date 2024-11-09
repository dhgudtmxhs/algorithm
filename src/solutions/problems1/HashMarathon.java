package solutions.problems1;

import java.util.HashMap;

public class HashMarathon { // https://school.programmers.co.kr/learn/courses/30/lessons/42576

    public static String marathon(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                return name;
            }
        }

        return null;
    }

}


