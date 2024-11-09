package solutions.problems1;

import java.util.HashSet;

public class HashPonkemon { // https://school.programmers.co.kr/learn/courses/30/lessons/1845

    public int ponKemon(int[] nums) {

        HashSet<Integer> pokemons = new HashSet<>();

        for(int pokemon : nums) {
            pokemons.add(pokemon);
        }

        int maxSize = nums.length / 2;

        return Math.min(pokemons.size(), maxSize);

    }
}
