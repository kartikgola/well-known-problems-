/*
 * Author: Kartik Gola
 * Date: 10/06/20, 5:53 PM
 * Copyright (c) 2020 | https://rattl.io
 */

package leetcode;

public class SpiralMatrix2 {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = 1;
        for ( int layer = 0; layer <= n / 2; ++layer ) {
            int r = layer, c = layer;
            for ( c = layer; c < n - layer; ++c ) {
                res[r][c] = count++;
            }
            c = n - layer - 1;
            for ( r = layer + 1; r < n - layer; ++r ) {
                res[r][c] = count++;
            }
            r = n - layer - 1;
            for ( c = n - layer - 2; c >= layer; --c ) {
                res[r][c] = count++;
            }
            c = layer;
            for ( r = n - layer - 2; r > layer; --r ) {
                res[r][c] = count++;
            }
        }

        return res;
    }
}