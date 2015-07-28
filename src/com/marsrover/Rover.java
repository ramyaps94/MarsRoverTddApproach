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
        if (this.direction == "N" || this.direction == "E" || this.direction == "S" || this.direction == "W")
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
        controlInput = controlInput.toUpperCase();
        for (int index = 0; index < controlInput.length(); index++) {
                switch (controlInput.charAt(index)) {
                    case 'L':
                        turnLeft();
                        break;
                    case 'R':
                        turnRight();
                        break;
                    case 'M':
                        moveInTheDirection();
                        break;
                }
            }
        return this;
    }

    private void moveInTheDirection() {
        if (isValidDirection()) {
            switch (this.direction) {
                case "N":
                    this.y = y + 1;
                    break;
                case "S":
                    this.y = y - 1;
                    break;
                case "E":
                    this.x = x + 1;
                    break;
                case "W":
                    this.x = x - 1;
                    break;
            }
        }
    }

    private void turnRight() {
        switch (this.direction) {
            case "N":
                this.direction = "E";
                break;
            case "S":
                this.direction = "W";
                break;
            case "E":
                this.direction = "S";
                break;
            case "W":
                this.direction = "N";
                break;

        }
    }

    private void turnLeft() {
        switch (this.direction) {
            case "N":
                this.direction = "W";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
            case "W":
                this.direction = "S";
                break;
        }
    }

}

