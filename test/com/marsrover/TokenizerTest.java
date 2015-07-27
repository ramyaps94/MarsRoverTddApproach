package com.marsrover;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TokenizerTest {

    @Test
    public void shouldGiveIntegerXAndYForStringPlateauBoundary() {
        Tokenizer tokenizer = new Tokenizer("5 2");

        List<Integer> actualValue = tokenizer.tokenizeStringtoIntegerForPlateau();

        assertEquals(Arrays.asList(5, 2), actualValue);

    }

    @Test
    public void shouldGiveNForTheStringAcceptingRoversPosition() {
        Tokenizer tokenizer = new Tokenizer("1 2 N");

        String actualValue = tokenizer.tokenizeStringToIntegerAndCharForRover();

        assertEquals("N", actualValue);

    }
}