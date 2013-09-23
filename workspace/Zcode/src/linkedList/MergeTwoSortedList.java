package linkedList;

import anode.ListNode;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		else if (l2 == null)
			return l1;
		ListNode head = null;
		ListNode prev = null;
		boolean sell1 = false;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val)
				sell1 = true;
			else
				sell1 = false;
			ListNode temp = sell1 ? l1 : l2;
			if (head == null)
				head = temp;
			if (prev != null)
				prev.next = temp;
			prev = temp;

			if (sell1)
				l1 = l1.next;
			else
				l2 = l2.next;
		}
		prev.next = (l1 == null) ? l2 : l1;
		return head;
	}
}
