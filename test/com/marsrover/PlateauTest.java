package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {
@Test
    public void shouldKnowTopRightX() {
    Tokenizer tokenizer = new Tokenizer("5 5");
    Plateau plateau = new Plateau(tokenizer.tokenizeString());

    assertEquals(5,plateau.getTopRightX());
}
}
