package com.marsrover;

public class Rover {
    private String direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public boolean isRoverWithinBoundary(Plateau plateau) {
        if ((this.x <= plateau.getBottomLeftX() && this.y <= plateau.getBottomLeftY()) ||
                (this.x >= plateau.getTopRightX() && this.y >= plateau.getTopRightY()))
            return false;
        else
            return true;
    }
}

