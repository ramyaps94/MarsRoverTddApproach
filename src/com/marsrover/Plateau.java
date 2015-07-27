package com.marsrover;

import java.util.ArrayList;

public class Plateau {
    int topRightX;
    int topRightY;
    int bottomLeftX = 0;
    int bottomLeftY = 0;

    public Plateau(ArrayList<Integer> plateauTopRightCorner) {
        topRightX = plateauTopRightCorner.get(0);
        topRightY = plateauTopRightCorner.get(1);
    }

    public int getTopRightX() {
        return topRightX;
    }

    public int getTopRightY() {
        return topRightY;
    }

    public int getBottomLeftX() {
        return bottomLeftX;
    }
}
