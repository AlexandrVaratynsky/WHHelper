package com.android.heightweightindex.whhelper.data;

public class AgeMaleCategoryWeightLimits extends AgeCategoryLimits {
    public AgeMaleCategoryWeightLimits() {
        //([:digit:]+.[:digit:])+([:space:])
        //statLimits.put("$1", new float[]{
        statLimits.put("1.0", new float[]{7.56f, 8.60f, 9.76f, 10.32f, 11.41f, 12.21f, 12.81f});
        statLimits.put("1.3", new float[]{8.28f, 9.26f, 10.16f, 10.90f, 12.09f, 13.29f, 13.90f});
        statLimits.put("1.6", new float[]{8.93f, 9.72f, 10.54f, 11.45f, 12.45f, 13.80f, 14.60f});
        statLimits.put("1.9", new float[]{9.52f, 10.19f, 10.88f, 11.86f, 12.89f, 14.33f, 15.29f});
        statLimits.put("2.0", new float[]{10.06f, 10.67f, 11.28f, 12.42f, 13.38f, 14.90f, 15.99f});
        statLimits.put("2.3", new float[]{10.55f, 11.14f, 11.73f, 12.82f, 13.92f, 15.48f, 16.68f});
        statLimits.put("2.6", new float[]{11.01f, 11.62f, 12.21f, 13.35f, 14.49f, 16.07f, 17.37f});
        statLimits.put("2.9", new float[]{11.44f, 12.10f, 12.72f, 13.91f, 15.09f, 16.68f, 18.06f});
        statLimits.put("3.0", new float[]{11.85f, 12.58f, 13.25f, 14.48f, 15.71f, 17.29f, 18.74f});
        statLimits.put("3.3", new float[]{12.24f, 13.06f, 13.79f, 15.07f, 16.35f, 17.90f, 19.43f});
        statLimits.put("3.6", new float[]{12.62f, 13.54f, 14.35f, 15.66f, 16.99f, 18.52f, 20.11f});
        statLimits.put("3.9", new float[]{12.99f, 14.01f, 14.91f, 16.25f, 17.63f, 19.14f, 20.79f});
        statLimits.put("4.0", new float[]{13.36f, 14.48f, 15.46f, 16.84f, 18.27f, 19.75f, 21.46f});
        statLimits.put("4.3", new float[]{13.73f, 14.94f, 16.02f, 17.43f, 18.90f, 20.37f, 22.15f});
        statLimits.put("4.6", new float[]{14.09f, 15.41f, 16.57f, 18.00f, 19.53f, 20.98f, 22.83f});
        statLimits.put("4.9", new float[]{14.47f, 15.86f, 17.11f, 18.57f, 20.15f, 21.60f, 23.52f});
        statLimits.put("5.0", new float[]{14.85f, 16.32f, 17.64f, 19.13f, 20.76f, 22.21f, 24.22f});
        statLimits.put("5.3", new float[]{15.23f, 16.77f, 18.16f, 19.68f, 21.36f, 22.83f, 24.92f});
        statLimits.put("5.6", new float[]{15.63f, 17.21f, 18.67f, 20.21f, 21.96f, 23.45f, 25.64f});
        statLimits.put("5.9", new float[]{16.03f, 17.65f, 19.17f, 20.74f, 22.54f, 24.07f, 26.37f});
        statLimits.put("6.0", new float[]{16.44f, 18.09f, 19.66f, 21.26f, 23.11f, 24.70f, 27.12f});
        statLimits.put("6.3", new float[]{16.86f, 18.53f, 20.14f, 21.76f, 23.69f, 25.35f, 27.89f});
        statLimits.put("6.6", new float[]{17.30f, 18.97f, 20.61f, 22.27f, 24.25f, 26.00f, 28.68f});
        statLimits.put("6.9", new float[]{17.74f, 19.40f, 21.07f, 22.76f, 24.82f, 26.67f, 29.50f});
        statLimits.put("7.0", new float[]{18.18f, 19.84f, 21.52f, 23.26f, 25.39f, 27.36f, 30.34f});
        statLimits.put("7.3", new float[]{18.64f, 20.27f, 21.98f, 23.76f, 25.97f, 28.07f, 31.21f});
        statLimits.put("7.6", new float[]{19.10f, 20.71f, 22.43f, 24.26f, 26.55f, 28.80f, 32.11f});
        statLimits.put("7.9", new float[]{19.57f, 21.16f, 22.89f, 24.77f, 27.15f, 29.56f, 33.04f});
        statLimits.put("8.0", new float[]{20.05f, 21.60f, 23.35f, 25.29f, 27.76f, 30.35f, 34.01f});
        statLimits.put("8.3", new float[]{20.53f, 22.06f, 23.81f, 25.82f, 28.40f, 31.17f, 35.01f});
        statLimits.put("8.6", new float[]{21.01f, 22.52f, 24.29f, 26.37f, 29.06f, 32.02f, 36.06f});
        statLimits.put("8.9", new float[]{21.49f, 22.99f, 24.79f, 26.94f, 29.75f, 32.91f, 37.14f});
        statLimits.put("9.0", new float[]{21.98f, 23.47f, 25.30f, 27.54f, 30.46f, 33.84f, 38.27f});
        statLimits.put("9.3", new float[]{22.47f, 23.97f, 25.83f, 28.16f, 31.22f, 34.82f, 39.44f});
        statLimits.put("9.6", new float[]{22.97f, 24.47f, 26.38f, 28.81f, 32.01f, 35.84f, 40.65f});
        statLimits.put("9.9", new float[]{23.46f, 25.00f, 26.97f, 29.50f, 32.85f, 36.90f, 41.91f});
        statLimits.put("10.0", new float[]{23.96f, 25.54f, 27.58f, 30.22f, 33.73f, 38.01f, 43.21f});
        statLimits.put("10.3", new float[]{24.45f, 26.11f, 28.22f, 30.99f, 34.65f, 39.16f, 44.55f});
        statLimits.put("10.6", new float[]{24.96f, 26.69f, 28.90f, 31.80f, 35.63f, 40.37f, 45.93f});
        statLimits.put("10.9", new float[]{25.46f, 27.30f, 29.62f, 32.65f, 36.66f, 41.62f, 47.36f});
        statLimits.put("11.0", new float[]{25.97f, 27.94f, 30.38f, 33.55f, 37.74f, 42.92f, 48.82f});
        statLimits.put("11.3", new float[]{26.49f, 28.60f, 31.18f, 34.51f, 38.88f, 44.27f, 50.33f});
        statLimits.put("11.6", new float[]{27.02f, 29.30f, 32.03f, 35.51f, 40.07f, 45.66f, 51.86f});
        statLimits.put("11.9", new float[]{27.56f, 30.03f, 32.92f, 36.56f, 41.31f, 47.10f, 53.43f});
        statLimits.put("12.0", new float[]{28.12f, 30.79f, 33.86f, 37.67f, 42.61f, 48.57f, 55.03f});
        statLimits.put("12.3", new float[]{28.70f, 31.60f, 34.85f, 38.83f, 43.96f, 50.08f, 56.65f});
        statLimits.put("12.6", new float[]{29.31f, 32.44f, 35.89f, 40.04f, 45.36f, 51.63f, 58.29f});
        statLimits.put("12.9", new float[]{29.94f, 33.32f, 36.97f, 41.31f, 46.80f, 53.21f, 59.95f});
        statLimits.put("13.0", new float[]{30.61f, 34.26f, 38.10f, 42.62f, 48.29f, 54.80f, 61.61f});
        statLimits.put("13.3", new float[]{31.32f, 35.23f, 39.28f, 43.98f, 49.81f, 56.42f, 63.28f});
        statLimits.put("13.6", new float[]{32.09f, 36.26f, 40.50f, 45.39f, 51.37f, 58.04f, 64.94f});
        statLimits.put("13.9", new float[]{32.91f, 37.35f, 41.77f, 46.83f, 52.95f, 59.67f, 66.58f});
        statLimits.put("14.0", new float[]{33.79f, 38.48f, 43.07f, 48.32f, 54.55f, 61.29f, 68.20f});
        statLimits.put("14.3", new float[]{34.76f, 39.68f, 44.41f, 49.84f, 56.15f, 62.89f, 69.79f});
        statLimits.put("14.6", new float[]{35.81f, 40.93f, 45.78f, 51.38f, 57.76f, 64.46f, 71.33f});
        statLimits.put("14.9", new float[]{36.96f, 42.25f, 47.18f, 52.94f, 59.35f, 66.00f, 72.83f});
        statLimits.put("15.0", new float[]{38.21f, 43.63f, 48.60f, 54.51f, 60.92f, 67.48f, 74.25f});
        statLimits.put("15.3", new float[]{39.60f, 45.09f, 50.03f, 56.09f, 62.44f, 68.89f, 75.60f});
        statLimits.put("15.6", new float[]{41.11f, 46.61f, 51.47f, 57.66f, 63.92f, 70.23f, 76.85f});
        statLimits.put("15.9", new float[]{42.79f, 48.21f, 52.90f, 59.21f, 65.32f, 71.46f, 78.00f});
        statLimits.put("16.0", new float[]{44.63f, 49.88f, 54.33f, 60.74f, 66.64f, 72.58f, 79.02f});
        statLimits.put("16.6", new float[]{46.66f, 51.63f, 55.73f, 62.22f, 67.85f, 73.57f, 79.90f});
        statLimits.put("17.0", new float[]{48.90f, 53.46f, 57.10f, 63.65f, 68.93f, 74.40f, 80.63f});
        statLimits.put("17.6", new float[]{51.36f, 55.38f, 58.43f, 65.01f, 69.86f, 75.06f, 81.18f});
        statLimits.put("18.0", new float[]{54.07f, 57.38f, 59.70f, 66.28f, 70.62f, 75.52f, 81.53f});
    }

//    @Override
//    public int getCategory(String age, float criteria) {
//        int result = 0;
//        float[] limits = statLimits.get(age);
//
//        if (criteria < limits[0]) {
//            result = 1;
//        } // <3%
//        if ((criteria >= limits[0]) && (criteria < limits[1])) {
//            result = 2;
//        } // <10% >=3%
//        if ((criteria >= limits[1]) && (criteria < limits[2])) {
//            result = 3;
//        } // <25%  >=10%
//        if ((criteria >= limits[2]) && (criteria < limits[4])) {
//            result = 4;
//        } // <=75% >=25%  3 skipped
//        if ((criteria >= limits[4]) && (criteria < limits[5])) {
//            result = 5;
//        } // <=90% >75%
//        if ((criteria >= limits[5]) && (criteria < limits[6])) {
//            result = 6;
//        }// <=97% >90
//        if (criteria > limits[6]) {
//            result = 7;
//        }// >97%
//        return result;
//    }
}
