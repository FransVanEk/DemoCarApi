package com.example.democarapi.helpers;

public class Capitalize {
    public static String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}

