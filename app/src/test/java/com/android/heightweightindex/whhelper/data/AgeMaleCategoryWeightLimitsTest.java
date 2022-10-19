package com.android.heightweightindex.whhelper.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeMaleCategoryWeightLimitsTest {
    String firstRowTableAge = "1.0";
    float firstRowTableValueForCategory1 = 7f;
    float firstRowTableValueForCategory2 = 8f;
    float firstRowTableValueForCategory3 = 9f;
    float firstRowTableValueForCategory4 = 10f;
    float firstRowTableValueForCategory5 = 12f;
    float firstRowTableValueForCategory6 = 12.5f;
    float firstRowTableValueForCategory7 = 13f;

    @Test
    public void getCategory_ShouldReturnFrom1to7() {
        AgeCategoryLimits weightMaleLimits = new AgeMaleCategoryWeightLimits();

        assertTrue(weightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory1) == 1);
        assertTrue(weightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory2) == 2);
        assertTrue(weightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory3) == 3);
        assertTrue(weightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory4) == 4);
        assertTrue(weightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory5) == 5);
        assertTrue(weightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory6) == 6);
        assertTrue(weightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory7) == 7);
    }

}