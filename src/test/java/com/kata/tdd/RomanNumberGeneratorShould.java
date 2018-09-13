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
    }
}
