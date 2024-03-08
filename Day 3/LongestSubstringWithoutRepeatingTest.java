import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringWithoutRepeatingTest {

    @Test
    public void testLengthOfLongestSubstring() {
        // Test case 1
        String input1 = "abcabcbb";
        int expected1 = 3;
        assertEquals(expected1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(input1));

        // Test case 2
        String input2 = "bbbbb";
        int expected2 = 1;
        assertEquals(expected2, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(input2));

        // Test case 3
        String input3 = "pwwkew";
        int expected3 = 3;
        assertEquals(expected3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(input3));

        // Additional test cases can be added here
    }
}
