/*
 * Author: Kartik Gola
 * Date: 12/23/20, 4:06 PM
 * Copyright (c) 2020 | https://kartikgola.com
 * Problem URL: https://leetcode.com/problems/next-greater-element-i/
 */

package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement2 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums2.length; ++i) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        return Arrays.stream(nums1)
                .map(x -> map.getOrDefault(x, -1))
                .toArray();
    }
}
