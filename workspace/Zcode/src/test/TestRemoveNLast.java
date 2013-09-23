package test;

import anode.ListNode;
import linkedList.ReverseLinkedListTwo;

public class TestRemoveNLast {

	public static void main(String[] args) {
		ReverseLinkedListTwo rl= new ReverseLinkedListTwo();
		ListNode l1= new ListNode(1);
		ListNode l2= new ListNode(2);
		ListNode l3= new ListNode(3);
		ListNode l4= new ListNode(4);
		ListNode l5= new ListNode(5);
		ListNode l6= new ListNode(6);
		ListNode l7= new ListNode(7);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l7;
		
		
		ListNode ret= rl.reverseBetween(l1,2,3);
		while(ret!=null){
			System.out.println(ret.val);
			ret=ret.next;
		}
	}
}
