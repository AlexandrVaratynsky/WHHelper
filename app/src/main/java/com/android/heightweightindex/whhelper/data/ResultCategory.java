package com.android.heightweightindex.whhelper.data;

public class ResultCategory {
    String[][] categoriesNames;

    public ResultCategory() {
        String[][] categories = new String[7][7];
        categories[0][0] = "Очень низкое, гармоничное. Задержка роста.";
        categories[0][1] = "Очень низкое, дисгармоничное. Задержка роста.";
        categories[0][2] = "Низкое, резко дисгармоничное. Задержка роста.";
        categories[0][3] = "Резко дисгармоничное. Задержка роста.";
        categories[0][4] = "Резко дисгармоничное. Задержка роста.";
        categories[0][5] = "Резко дисгармоничное. Задержка роста.";
        categories[0][6] = "Резко дисгармоничное. Задержка роста.";
        categories[1][0] = "Очень низкое, дисгармоничное.";
        categories[1][1] = "Низкое, гармоничное.";
        categories[1][2] = "Низкое, дисгармоничное.";
        categories[1][3] = "Резко дисгармоничное.";
        categories[1][4] = "Резко дисгармоничное.";
        categories[1][5] = "Резко дисгармоничное.";
        categories[1][6] = "Резко дисгармоничное.";
        categories[2][0] = "Очень низкое. Резко дисгармоничное.";
        categories[2][1] = "Низкое дисгармоничное.";
        categories[2][2] = "Ниже среднего, гармоничное (гипостатура).";
        categories[2][3] = "Ниже среднего, дисгармоничное.";
        categories[2][4] = "Резко дисгармоничное.";
        categories[2][5] = "Резко дисгармоничное.";
        categories[2][6] = "Резко дисгармоничное.";
        categories[3][0] = "Низкое, резко дисгармоничное.";
        categories[3][1] = "Низкое, резко дисгармоничное.";
        categories[3][2] = "Ниже среднего, дисгармоничное.";
        categories[3][3] = "Среднее, гармоничное.";
        categories[3][4] = "Выше среднего, дисгармоничное.";
        categories[3][5] = "Резко дисгармоничное.";
        categories[3][6] = "Резко дисгармоничное.";
        categories[4][0] = "Резко дисгармоничное.";
        categories[4][1] = "Резко дисгармоничное.";
        categories[4][2] = "Резко дисгармоничное.";
        categories[4][3] = "Выше среднего, дисгармоничное.";
        categories[4][4] = "Выше среднего, гармоничное.";
        categories[4][5] = "Высокое, дисгармоничное.";
        categories[4][6] = "Высокое, резко дисгармоничное";
        categories[5][0] = "Резко дисгармоничное.";
        categories[5][1] = "Резко дисгармоничное.";
        categories[5][2] = "Резко дисгармоничное.";
        categories[5][3] = "Резко дисгармоничное.";
        categories[5][4] = "Высокое, дисгармоничное.";
        categories[5][5] = "Высокое, гармоничное.";
        categories[5][6] = "Очень высокое, дисгармоничное.";
        categories[6][0] = "Резко дисгармоничное.";
        categories[6][1] = "Резко дисгармоничное.";
        categories[6][2] = "Резко дисгармоничное.";
        categories[6][3] = "Резко дисгармоничное.";
        categories[6][4] = "Высокое, резко дисгармоничное.";
        categories[6][5] = "Очень высокое, дисгармоничное.";
        categories[6][6] = "Очень высокое, гармоничное.";

        this.categoriesNames = categories;
    }

    public String getCategoryName(int heightCategory, int weightCategory) {
        String result = "";
        boolean hCheck = (heightCategory-1 >= 0) && (heightCategory-1 < 7);
        boolean wCheck = (weightCategory-1 >= 0) && (weightCategory-1 < 7);

        if (hCheck && wCheck) {
            result = categoriesNames[heightCategory-1][weightCategory-1];
        } else {
            result = "error";
        }

        return result;
    }
}
