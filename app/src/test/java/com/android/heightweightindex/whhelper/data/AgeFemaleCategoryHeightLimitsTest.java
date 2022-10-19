package com.android.heightweightindex.whhelper.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeFemaleCategoryHeightLimitsTest {
    String firstRowTableAge = "1.0";
    float firstRowTableValueForCategory1 = 8f;
    float firstRowTableValueForCategory2 = 70f;
    float firstRowTableValueForCategory3 = 72f;
    float firstRowTableValueForCategory4 = 75f;
    float firstRowTableValueForCategory5 = 77f;
    float firstRowTableValueForCategory6 = 80f;
    float firstRowTableValueForCategory7 = 90f;

    @Test
    public void getCategory_ShouldReturnFrom1to7() {
        AgeCategoryLimits heightFemaleLimits = new AgeFemaleCategoryHeightLimits();

        assertTrue(heightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory1) == 1);
        assertTrue(heightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory2) == 2);
        assertTrue(heightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory3) == 3);
        assertTrue(heightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory4) == 4);
        assertTrue(heightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory5) == 5);
        assertTrue(heightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory6) == 6);
        assertTrue(heightFemaleLimits.getCategory(firstRowTableAge, firstRowTableValueForCategory7) == 7);
    }

}