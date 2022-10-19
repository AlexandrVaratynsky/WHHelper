package com.android.heightweightindex.whhelper.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeMaleCategoryHeightLimitsTest {
    String firstRowTableAge = "1.0";
    float firstRowTableValueForCategory1 = 70f;
    float firstRowTableValueForCategory2 = 71f;
    float firstRowTableValueForCategory3 = 74f;
    float firstRowTableValueForCategory4 = 75f;
    float firstRowTableValueForCategory5 = 80f;
    float firstRowTableValueForCategory6 = 84f;
    float firstRowTableValueForCategory7 = 90f;

    @Test
    public void getCategory_ShouldReturnFrom1to7() {
        AgeCategoryLimits heightMaleLimits = new AgeMaleCategoryHeightLimits();

        assertTrue(heightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory1) == 1);
        assertTrue(heightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory2) == 2);
        assertTrue(heightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory3) == 3);
        assertTrue(heightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory4) == 4);
        assertTrue(heightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory5) == 5);
        assertTrue(heightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory6) == 6);
        assertTrue(heightMaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory7) == 7);
    }

}