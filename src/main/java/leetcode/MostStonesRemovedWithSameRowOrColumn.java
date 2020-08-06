/*
 * Author: Kartik Gola
 * Date: 14/07/20, 10:50 PM
 * Copyright (c) 2020 | https://rattl.io
 * Problem URL: https://leetcode.com/problems/most-stones-removed-with-same-row-or-column
 */

package leetcode;

import ds.UnionFind;

public class MostStonesRemovedWithSameRowOrColumn {

    public int removeStones(int[][] stones) {
        final int n = stones.length;
        UnionFind unionFind = new UnionFind(n);
        for ( int i = 0; i < n; ++i ) {
            for ( int j = i + 1; j < n; ++j ) {
                if ( stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1] )
                    unionFind.union(i, j);
            }
        }
        return n - unionFind.getUnionsCount();
    }
}
