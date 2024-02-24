import java.util.Arrays;

public class ShoppingTest {

    public static void main(String[] args) {
        // Test case 1: Simple case with four items
        int[] prices1 = {5,6,10, 20};
        int target1 = 30;
        int[] expectedIndices1 = {2, 3};
        testFindItems(prices1, target1, expectedIndices1);

        // Test case 2: No combination of items adds up to the target
        int[] prices2 = {10, 20, 30, 40};
        int target2 = 15;
        int[] expectedIndices2 = null;
        testFindItems(prices2, target2, expectedIndices2);

        // Test case 3: Multiple combinations of items add up to the target, return the first found
        int[] prices3 = {2, 4, 8, 10};
        int target3 = 12;
        int[] expectedIndices3 = {0, 2};
        testFindItems(prices3, target3, expectedIndices3);
    }

    public static void testFindItems(int[] prices, int target, int[] expectedIndices) {
        int[] actualIndices = Shopping.findItems(prices, target);
        if (Arrays.equals(actualIndices, expectedIndices)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("Expected: " + Arrays.toString(expectedIndices));
            System.out.println("Actual: " + Arrays.toString(actualIndices));
        }
    }
}
