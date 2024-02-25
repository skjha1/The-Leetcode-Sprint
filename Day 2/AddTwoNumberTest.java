import static org.junit.Assert.*;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        // Create instances of AddTwoNumbers class and ListNode class
        AddTwoNumbers solution = new AddTwoNumbers();

        // Test case 1: Addition of two numbers with single digits
        ListNode l1 = solution.createLinkedList(new int[]{2}); // Number: 2
        ListNode l2 = solution.createLinkedList(new int[]{3}); // Number: 3
        ListNode expected1 = solution.createLinkedList(new int[]{5}); // Expected result: 5
        assertEqualLinkedList(expected1, solution.addTwoNumbers(l1, l2));

        // Test case 2: Addition of two numbers with multiple digits
        ListNode l3 = solution.createLinkedList(new int[]{2, 4, 3}); // Number: 342
        ListNode l4 = solution.createLinkedList(new int[]{5, 6, 4}); // Number: 465
        ListNode expected2 = solution.createLinkedList(new int[]{7, 0, 8}); // Expected result: 807
        assertEqualLinkedList(expected2, solution.addTwoNumbers(l3, l4));

        // Test case 3: Addition of two numbers with different number of digits
        ListNode l5 = solution.createLinkedList(new int[]{9, 9, 9}); // Number: 999
        ListNode l6 = solution.createLinkedList(new int[]{1}); // Number: 1
        ListNode expected3 = solution.createLinkedList(new int[]{0, 0, 0, 1}); // Expected result: 1000
        assertEqualLinkedList(expected3, solution.addTwoNumbers(l5, l6));
    }

    // Helper method to compare two linked lists
    private void assertEqualLinkedList(ListNode expected, ListNode result) {
        while (expected != null && result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
        assertNull(expected); // Check if expected list is exhausted
        assertNull(result); // Check if result list is exhausted
    }
}
