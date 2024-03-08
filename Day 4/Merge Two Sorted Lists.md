### Problem Description

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

### Explanation

Imagine you have two lists of numbers, and each list is already in order from smallest to biggest, like this:

List 1: 1 -> 3 -> 5  
List 2: 2 -> 4 -> 6

Now, you need to combine these two lists into one big list, still keeping all the numbers in order. So, the merged list should look like this:

Merged List: 1 -> 2 -> 3 -> 4 -> 5 -> 6

To do this, you just need to look at the first number in each list. Pick the smallest one and add it to your new merged list. Then, move to the next number in the list where the smaller number came from. Keep doing this until you've used up all the numbers in both lists.

Finally, you'll have one big merged list that has all the numbers from both lists, and they'll still be in order from smallest to biggest. Then, you just need to tell which number is the first in this big merged list. That's what "Return the head of the merged linked list" means. It's like telling you which box to look in to find the first number in your big list.
