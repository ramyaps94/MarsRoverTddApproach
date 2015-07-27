package com.marsrover;

import java.util.ArrayList;

public class Plateau {
    int topRightX;
    int topRightY;

    public Plateau(ArrayList<Integer> plateauTopRightCorner) {
        topRightX = plateauTopRightCorner.get(0);
        topRightY = plateauTopRightCorner.get(1);
    }

    public int getTopRightX() {
        return topRightX;
    }
}
