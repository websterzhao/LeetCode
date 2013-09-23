package linkedList;

import java.util.ArrayList;

import anode.ListNode;

public class MergekSortedLists {
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		if (lists == null || lists.size() == 0)
			return null;
		ArrayList<ListNode> newlists = new ArrayList<ListNode>();
		for(ListNode ll: lists){                    //must use new lists to remove null list
			if(ll!=null)
				newlists.add(ll);
		}
		ListNode cur = null;
		ListNode ret = null;
		while (newlists.size() > 0) {
			ListNode temp = newlists.get(0);
			int min = 0;
			for (int i = 1; i < newlists.size(); i++) {
				if (newlists.get(i).val < temp.val) {
					temp = newlists.get(i);
					min = i;
				}
			}
			if (cur != null)
				cur.next = temp;
			cur = temp;
			if (ret == null)
				ret = cur;
			ListNode next = temp.next;
			if (next == null)
				newlists.remove(min);
			else
				newlists.set(min, next);
		}
		return ret;
	}
}
