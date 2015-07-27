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

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Rover rover = (Rover) that;
        if (x != rover.x)
            return false;
        if (y != rover.y)
            return false;
        return !(direction != null ? !direction.equals(rover.direction) : rover.direction != null);
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }

    public Rover getNextPositionOfRover(String controlInput) {
        if (controlInput == "l") {
            this.direction = "W";
        }
        return this;
    }
}

