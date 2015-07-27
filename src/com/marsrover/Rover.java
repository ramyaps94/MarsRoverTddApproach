package com.marsrover;

public class Rover {
    private String direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction.toUpperCase();
    }

    public boolean isRoverWithinBoundary(Plateau plateau) {
        if ((this.x <= plateau.getBottomLeftX() && this.y <= plateau.getBottomLeftY()) ||
                (this.x >= plateau.getTopRightX() && this.y >= plateau.getTopRightY()))
            return false;
        else
            return true;
    }

    public boolean isValidDirection() {
        if(this.direction == "N" || this.direction == "E" || this.direction == "S" || this.direction == "W" )
            return true;
        else
            return false;
    }
}

