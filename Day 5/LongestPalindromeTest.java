import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestPalindromeTest {

    @Test
    public void testLongestPalindrome() {
        // Test case 1
        String input1 = "babad";
        String expected1 = "bab"; // or "aba"
        assertEquals(expected1, LongestPalindrome.longestPalindrome(input1));

        // Test case 2
        String input2 = "cbbd";
        String expected2 = "bb";
        assertEquals(expected2, LongestPalindrome.longestPalindrome(input2));

        // Add more test cases as needed
    }
}
