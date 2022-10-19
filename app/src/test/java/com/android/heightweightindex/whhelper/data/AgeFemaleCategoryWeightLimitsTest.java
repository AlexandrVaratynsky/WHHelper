package com.android.heightweightindex.whhelper.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeFemaleCategoryWeightLimitsTest {
    String firstRowTableAge = "1.0";
    float firstRowTableValueForCategory1 = 8f;
    float firstRowTableValueForCategory2 = 9f;
    float firstRowTableValueForCategory3 = 9.3f;
    float firstRowTableValueForCategory4 = 9.5f;
    float firstRowTableValueForCategory5 = 10.5f;
    float firstRowTableValueForCategory6 = 11.5f;
    float firstRowTableValueForCategory7 = 12f;

    @Test
    public void getCategory_ShouldReturnFrom1to7() {
        AgeCategoryLimits weightFemaleLimits = new AgeFemaleCategoryWeightLimits();

        assertTrue(weightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory1) == 1);
        assertTrue(weightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory2) == 2);
        assertTrue(weightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory3) == 3);
        assertTrue(weightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory4) == 4);
        assertTrue(weightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory5) == 5);
        assertTrue(weightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory6) == 6);
        assertTrue(weightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory7) == 7);
    }

}