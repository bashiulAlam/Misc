package com.konasl.util;

import java.util.*;

/**
 * Created by Sabab on 1/21/2020.
 */
public class RandomGenerator {

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    boolean checkDuplicate(List<Integer> gameNumbers, int number) {

        if (!gameNumbers.contains(number)) {
            return true;
        }
        return false;
    }

    public List<Integer> gameNumbers(int min, int max) {

        List<Integer> gameNumbers = new ArrayList<Integer>();
        while (gameNumbers.size() < 5) {
            int number = getRandomNumberInRange(min, max);

            if (gameNumbers.size() == 0) {
                gameNumbers.add(number);
                continue;
            }

            if (checkDuplicate(gameNumbers, number)) {
                gameNumbers.add(number);
            }
        }

        Collections.sort(gameNumbers);
        return gameNumbers;
    }
}
