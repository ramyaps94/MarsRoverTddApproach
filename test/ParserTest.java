import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ParserTest {
    @Test
    public void shouldGiveIntegerXAndYForStringPlateauBoundary() {
        Parser parser = new Parser("5 2");

        int expectedValue[] = {5, 2};
        List<Integer> actualValue = parser.parseString();

        assertEquals(Arrays.asList(5, 2), actualValue);

    }
}