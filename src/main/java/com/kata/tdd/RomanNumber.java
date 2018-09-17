package com.kata.tdd;

public class RomanNumber {
    public static String generate(int decimal) {
        StringBuilder roman = new StringBuilder();
        for (RomanToDecimal romanToDecimal : RomanToDecimal.values()) {
            while (decimal >= romanToDecimal.decimal()) {
                roman.append(romanToDecimal.roman());
                decimal -= romanToDecimal.decimal();
            }
        }
        return roman.toString();
    }
}
