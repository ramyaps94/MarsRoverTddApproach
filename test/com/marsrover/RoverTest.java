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

    @Test
    public void shouldKnowValidDirectionOfRoversMovement() {
        Rover rover = new Rover(1, 2, "N");

        assertEquals(true,rover.isValidDirection());

    }

    @Test
    public void shouldKnowToReturnFalseForInValidDirectionOfRoversMovement() {
        Rover rover = new Rover(1, 2, "P");

        assertEquals(false,rover.isValidDirection());

    }

    @Test
    public void shouldKnowTheEqualityOfTwoRoverObject() {
        Rover rover = new Rover(1, 2, "N");

        assertEquals(new Rover(1, 2, "N"),rover);
    }

    @Test
    public void shouldReturnTheInitialPositionOfTheRover() {
        Rover rover = new Rover(1, 2, "N");

        String controlInput = "l";
        Rover expected = new Rover(1, 2, "W");

        assertEquals(expected, rover.getNextPositionOfRover(controlInput));
    }

}