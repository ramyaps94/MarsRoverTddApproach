package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    @Test
    public void shouldKnowTopRightX() {
        Tokenizer tokenizer = new Tokenizer("5 5");
        Plateau plateau = new Plateau(tokenizer.tokenizeStringtoIntegerForPlateau());

        assertEquals(5, plateau.getTopRightX());
    }

    @Test
    public void shouldKnowTopRightY() {
        Tokenizer tokenizer = new Tokenizer("7 2");
        Plateau plateau = new Plateau(tokenizer.tokenizeStringtoIntegerForPlateau());

        assertEquals(2, plateau.getTopRightY());
    }

    @Test
    public void shouldKnowBottomLeftX() {
        Tokenizer tokenizer = new Tokenizer("5 5");
        Plateau plateau = new Plateau(tokenizer.tokenizeStringtoIntegerForPlateau());

        assertEquals(0, plateau.getBottomLeftX());
    }

    @Test
    public void shouldKnowBottomLeftY() {
        Tokenizer tokenizer = new Tokenizer("5 5");
        Plateau plateau = new Plateau(tokenizer.tokenizeStringtoIntegerForPlateau());

        assertEquals(0, plateau.getBottomLeftY());
    }
}
