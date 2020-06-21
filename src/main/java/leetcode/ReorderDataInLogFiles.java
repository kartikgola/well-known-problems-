/*
 * Author: Kartik Gola
 * Date: 20/06/20, 11:43 AM
 * Copyright (c) 2020 | https://rattl.io
 */

package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReorderDataInLogFiles {

    public String[] reorderLogFiles(String[] logs) {
        List<String> dLogs = new ArrayList<>();
        List<String> lLogs = new ArrayList<>();
        String[] res = new String[logs.length];

        for ( int i = 0; i < logs.length; ++i ) {
            char ch = logs[i].charAt(logs[i].length() - 1);
            if ( ch >= '0' && ch <= '9' ) {
                dLogs.add(logs[i]);
            } else {
                lLogs.add(logs[i]);
            }
        }

        Collections.sort(lLogs, (String a, String b) -> {
            String aa = a.substring(a.indexOf(" ") + 1, a.length());
            String bb = b.substring(b.indexOf(" ") + 1, b.length());
            int d = aa.compareTo(bb);
            if ( d == 0 )
                d = a.compareTo(b);
            return d;
        });

        for ( int i = 0; i < lLogs.size(); ++i )
            res[i] = lLogs.get(i);

        for ( int i = lLogs.size(); i < res.length; ++i )
            res[i] = dLogs.get(i - lLogs.size());

        return res;
    }
}
