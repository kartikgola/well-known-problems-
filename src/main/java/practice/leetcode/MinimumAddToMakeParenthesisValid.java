/*
 * Author: Kartik Gola
 * Date: 1/1/22, 10:21 PM
 * Copyright (c) 2021 | https://kartikgola.com
 */

package practice.leetcode;

public class MinimumAddToMakeParenthesisValid {

    public int minAddToMakeValid(String s) {
        int open = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }

        if (open > 0)
            ans += open;

        return ans;
    }
}
