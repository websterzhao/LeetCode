package linkedList;

import anode.ListNode;

public class AddTwoLists {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode prev = null;
		int sum =0;
		int carry = 0 ;
		while(l1!=null&&l2!=null){
		    sum = l1.val+l2.val+carry;
			ListNode itr = new ListNode(sum%10);
			carry = sum/10;
			if(head==null){
				head = itr;
				prev = itr;
			}
			else{
				prev.next = itr;
			    prev= itr;
			}				
			l1=l1.next;
			l2=l2.next;
		}
		ListNode rest = (l1==null&&l2==null)?null:(l1==null?l2:l1);
		while(rest!=null){
		    sum = rest.val+carry;
			ListNode itr = new ListNode(sum%10);
			carry = sum/10;
            prev.next = itr;
            prev= itr;
			rest=rest.next;
		}
		if(carry!=0)
			prev.next= new ListNode(carry);
		return head;
	}
}
