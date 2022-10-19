package com.android.heightweightindex.whhelper.data;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AgeCategoryLimits {
    protected Map<String, float[]> statLimits = new LinkedHashMap<>();

    public int getCategory(String age, float criteria) {
        int result = 0;
        float[] limits = statLimits.get(age);

        if (criteria < limits[0]) {
            result = 1;
        } // <3%
        if ((criteria >= limits[0]) && (criteria < limits[1])) {
            result = 2;
        } // <10% >=3%
        if ((criteria >= limits[1]) && (criteria < limits[2])) {
            result = 3;
        } // <25%  >=10%
        if ((criteria >= limits[2]) && (criteria < limits[4])) {
            result = 4;
        } // <=75% >=25%  3 skipped
        if ((criteria >= limits[4]) && (criteria < limits[5])) {
            result = 5;
        } // <=90% >75%
        if ((criteria >= limits[5]) && (criteria < limits[6])) {
            result = 6;
        }// <=97% >90
        if (criteria > limits[6]) {
            result = 7;
        }// >97%
        return result;
    }

    public String[] getAges(){
        String[] result = new String[statLimits.size()];
        statLimits.keySet().toArray(result);
        return result;
    }
}
