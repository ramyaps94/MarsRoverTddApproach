package com.marsrover;

import java.util.ArrayList;

public class Tokenizer {
    private String input;
    private int x;
    private int y;
    private int[] tokenizedInput = {};

    public Tokenizer(String input) {
        this.input = input;
    }

    public ArrayList<Integer> tokenizeString() {
        ArrayList<Integer> tokenizedInput = new ArrayList<Integer>();
        String[] thisInput = this.input.split(" ");
        x = Integer.parseInt(thisInput[0]);
        y = Integer.parseInt(thisInput[1]);
        tokenizedInput.add(x);
        tokenizedInput.add(y);

        return tokenizedInput;
    }
}