package com.kata.tdd;

import org.junit.Test;

import static com.kata.tdd.RomanNumber.generate;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumberGeneratorShould {

    @Test
    public void generate_roman_number_for_a_given_decimal() {
        assertThat(generate(1), is("I"));
        assertThat(generate(2), is("II"));
        assertThat(generate(3), is("III"));
        assertThat(generate(4), is("IV"));
        assertThat(generate(5), is("V"));
        assertThat(generate(6), is("VI"));
        assertThat(generate(7), is("VII"));
        assertThat(generate(8), is("VIII"));
        assertThat(generate(10), is("X"));
        assertThat(generate(11), is("XI"));
        assertThat(generate(16), is("XVI"));
        assertThat(generate(40), is("XL"));
        assertThat(generate(50), is("L"));
        assertThat(generate(60), is("LX"));
        assertThat(generate(90), is("XC"));
        assertThat(generate(100), is("C"));
        assertThat(generate(116), is("CXVI"));
        assertThat(generate(695), is("DCXCV"));
        assertThat(generate(900), is("CM"));
        assertThat(generate(1000), is("M"));
        assertThat(generate(2008), is("MMVIII"));
        assertThat(generate(1999), is("MCMXCIX"));
        assertThat(generate(846), is("DCCCXLVI"));
    }
}
