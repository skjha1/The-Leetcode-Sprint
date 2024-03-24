import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {

    @Test
    public void testMaxArea() {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        // Test case 1: Example input
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected1 = 49; // Expected maximum area
        assertEquals(expected1, solution.maxArea(height1));

        // Test case 2: All heights are the same
        int[] height2 = {3, 3, 3, 3, 3, 3};
        int expected2 = 15; // Expected maximum area
        assertEquals(expected2, solution.maxArea(height2));

        // Test case 3: Increasing heights
        int[] height3 = {1, 2, 3, 4, 5};
        int expected3 = 6; // Expected maximum area
        assertEquals(expected3, solution.maxArea(height3));

        // Test case 4: Decreasing heights
        int[] height4 = {5, 4, 3, 2, 1};
        int expected4 = 6; // Expected maximum area
        assertEquals(expected4, solution.maxArea(height4));

        // Test case 5: Empty array
        int[] height5 = {};
        int expected5 = 0; // Expected maximum area
        assertEquals(expected5, solution.maxArea(height5));
    }
}
