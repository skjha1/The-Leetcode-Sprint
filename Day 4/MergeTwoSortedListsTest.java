import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() {
        // Create the first sorted linked list: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // Create the second sorted linked list: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // Expected merged list: 1 -> 1 -> 2 -> 3 -> 4 -> 4
        int[] expected = {1, 1, 2, 3, 4, 4};

        // Merge the two sorted lists
        MergeTwoSortedLists merger = new MergeTwoSortedLists();
        ListNode mergedList = merger.mergeTwoLists(l1, l2);

        // Compare the merged list with the expected result
        ListNode current = mergedList;
        for (int val : expected) {
            assertNotNull(current);
            assertEquals(val, current.val);
            current = current.next;
        }
        assertNull(current); // Ensure the merged list ends correctly
    }
}
