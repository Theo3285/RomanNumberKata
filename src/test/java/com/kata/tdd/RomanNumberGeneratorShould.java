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
        assertThat(generate(5), is("V"));
        assertThat(generate(6), is("VI"));
        assertThat(generate(7), is("VII"));
        assertThat(generate(8), is("VIII"));
        assertThat(generate(10), is("X"));
    }
}
