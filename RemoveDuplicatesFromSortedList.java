// LeetCode #83

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode newList = head;

		while (newList != null && newList.next != null) {
			if (newList.val == newList.next.val) {
				newList.next = newList.next.next;

			}
            else
			    newList = newList.next;

		}

		return head;
    }
}
