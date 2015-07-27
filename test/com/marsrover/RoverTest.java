package com.marsrover;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldKnowValidRoverPositionWithinBoundary() {
        Rover rover = new Rover(1, 2, "N");
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(5);
        input.add(5);
        Plateau plateau = new Plateau(input);

        assertEquals(true, rover.isRoverWithinBoundary(plateau));
    }
}