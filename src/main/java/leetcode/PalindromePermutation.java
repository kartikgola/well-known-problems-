/*
 * Author: Kartik Gola
 * Date: 02/01/2021, 13:49
 * Copyright (c) 2021 | https://rattl.io
 * Problem URL: https://leetcode.com/problems/palindrome-permutation/
 */

package leetcode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromePermutation {

    public boolean canPermutePalindrome(String s) {
        Map<Integer, Long> map = s.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean odds = false;
        for (Long val : map.values()) {
            if (odds && val % 2 != 0)
                return false;
            odds = val % 2 != 0;
        }

        return true;
    }
}
