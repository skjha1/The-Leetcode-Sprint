import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(carry % 10);
            carry /= 10;
            current = current.next;
        }

        return dummy.next;
    }

    // Method to create a linked list from an array of integers
    public ListNode createLinkedList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Method to print a linked list
    public void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of digits for the first number:");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the digits of the first number (in reverse order):");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        ListNode l1 = solution.createLinkedList(arr1);

        System.out.println("Enter the numbers of digits for the second number:");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the digits of the second number (in reverse order):");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        ListNode l2 = solution.createLinkedList(arr2);

        scanner.close();

        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.print("Result: ");
        solution.printLinkedList(result);
    }
}
