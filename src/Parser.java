import java.util.ArrayList;

public class Parser {
    private String input;
    private int x;
    private int y;
    private int[] parsedInput = {0, 0};

    public Parser(String input) {
        this.input = input;
    }

    public ArrayList<Integer> parseString() {
        ArrayList<Integer> parsedInput = new ArrayList<Integer>();
        String[] thisInput = this.input.split(" ");
        x = Integer.parseInt(thisInput[0]);
        y = Integer.parseInt(thisInput[1]);
        parsedInput.add(x);
        parsedInput.add(y);

        return parsedInput;
    }
}