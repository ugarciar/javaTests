package org.common;

import java.util.Arrays;
import java.util.Random;

public enum Category {
    BOOKS("Books"),
    BABY("Baby"),
    TOYS("Toys");

    private String description;

    Category(String description) {
        this.description = description;
    }

    private static final Random PRNG = new Random();

    public static String randomCategory()  {
        Category[] categoryValues = values();
        String[] categories = new String[categoryValues.length];
        for(int index = 0; index < categories.length; index++){
            categories[index] = categoryValues[index].description;
        }
        return categories[PRNG.nextInt(categories.length)];
    }
}
