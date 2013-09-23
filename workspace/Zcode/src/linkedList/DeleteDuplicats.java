package linkedList;

import anode.ListNode;

public class DeleteDuplicats {
	
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode cur = head.next;
		ListNode prev = head;
		while (cur != null) {
			if (prev.val!=cur.val) {
				prev.next = cur;
				prev = cur;
			}
			cur = cur.next;
		}
		prev.next = null;
		return head;
	}
	
	public ListNode deleteDuplicatesAll(ListNode head) {
	     if (head == null)
				return null;
			ListNode cur = head;
			ListNode prev = null;
			while (cur != null) {
				boolean isDup=false;
				ListNode itr=cur.next;
				while(itr!=null&&itr.val==cur.val) {     //��ȥ���м���ظ�Node
					cur.next=itr.next;
					itr=itr.next;
					isDup=true;
				}
				if(isDup){               
					if(prev==null)              //��ȥ��ͷ�Ǹ�
						head=itr;
					else
						prev.next=itr;
	                cur=itr;
				}	
				else{
					prev=cur;
					cur=cur.next;
				}			
			}
			return head;
	}

}
