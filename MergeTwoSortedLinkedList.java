// LeetCode #21

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode s;
		ListNode mergedNode;
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.val <= l2.val){
			s = l1;
			l1 = l1.next;
		}
		else{
			s = l2;
			l2 = l2.next;
		}
		
		mergedNode = s;
		
		while(l1 != null && l2 != null){
			if(l1.val <= l2.val){
				s.next = l1;
				s = s.next;
				l1 = l1.next;
				
			}
			else{
				s.next = l2;
				s = s.next;
				l2 = l2.next;
			}
		}
		
		if(l1 == null)
			s.next = l2;
		if(l2 == null)
			s.next = l1;
		
		return mergedNode;
    }
}
