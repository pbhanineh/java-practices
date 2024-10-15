import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestTest {
    private LongestDistinctSubstring longestDistinctSubstring;


    @BeforeEach
    public void setUp() {
        longestDistinctSubstring = new LongestDistinctSubstring();
    }

    @Test
    public void testDistinctCharacters() {
        String input = "abcdef";
        String result = longestDistinctSubstring.longestDistinctSubstring(input);
        assertEquals("abcdef", result, "The longest distinct substring in 'abcdef' should be 'abcdef'");
    }
}
